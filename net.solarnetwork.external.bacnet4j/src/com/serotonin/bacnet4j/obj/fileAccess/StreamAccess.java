package com.serotonin.bacnet4j.obj.fileAccess;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.type.constructed.SequenceOf;
import com.serotonin.bacnet4j.type.enumerated.ErrorClass;
import com.serotonin.bacnet4j.type.enumerated.ErrorCode;
import com.serotonin.bacnet4j.type.enumerated.FileAccessMethod;
import com.serotonin.bacnet4j.type.primitive.OctetString;
import com.serotonin.bacnet4j.util.sero.StreamUtils;

public class StreamAccess implements FileAccess {
    static final Logger LOG = LoggerFactory.getLogger(StreamAccess.class);

    private final File file;

    public StreamAccess(final File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    @Override
    public FileAccessMethod getAccessMethod() {
        return FileAccessMethod.streamAccess;
    }

    @Override
    public long recordCount() {
        return 0;
    }

    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public boolean isDirectory() {
        return file.isDirectory();
    }

    @Override
    public boolean exists() {
        return file.exists();
    }

    @Override
    public long length() {
        return file.length();
    }

    @Override
    public long lastModified() {
        return file.lastModified();
    }

    @Override
    public boolean canWrite() {
        return file.canWrite();
    }

    @Override
    public boolean delete() {
        return file.delete();
    }

    @Override
    public void validateFileSizeWrite(final long fileSize) throws BACnetServiceException {
        // Overridden to allow the writing of the file size.
    }

    @Override
    public void writeFileSize(final long fileSize) {
        try {
            try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
                raf.setLength(fileSize);
            }
            //            }
        } catch (final IOException e) {
            LOG.error("Failed to write file size {}", fileSize, e);
        }
    }

    @Override
    public void writeRecordCount(final long recordCount) {
        throw new RuntimeException("not implemented");
    }

    @Override
    public boolean supportsStreamAccess() {
        return true;
    }

    @Override
    public OctetString readData(final long start, final long length) throws IOException, BACnetServiceException {
        long skip = start;
        try (FileInputStream in = new FileInputStream(file)) {
            while (skip > 0) {
                final long result = in.skip(skip);
                if (result == -1)
                    // EOF
                    break;
                skip -= result;
            }
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            StreamUtils.transfer(in, out, length);
            return new OctetString(out.toByteArray());
        }
    }

    @Override
    public long writeData(final long start, final OctetString data) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            final long actualStart = start == -1 ? raf.length() : start;

            if (actualStart > raf.length()) {
                raf.setLength(actualStart);
            }
            raf.seek(actualStart);

            final byte bytes[] = data.getBytes();
            raf.write(bytes);

            return actualStart;
        }
    }

    @Override
    public boolean supportsRecordAccess() {
        return false;
    }

    @Override
    public SequenceOf<OctetString> readRecords(final long start, final long count)
            throws IOException, BACnetServiceException {
        throw new BACnetServiceException(ErrorClass.services, ErrorCode.invalidFileAccessMethod);
    }

    @Override
    public long writeRecords(final long start, final SequenceOf<OctetString> data)
            throws IOException, BACnetServiceException {
        throw new BACnetServiceException(ErrorClass.services, ErrorCode.invalidFileAccessMethod);
    }
}
