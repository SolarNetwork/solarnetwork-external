package com.serotonin.bacnet4j.obj.fileAccess;

import java.io.IOException;

import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.type.constructed.SequenceOf;
import com.serotonin.bacnet4j.type.enumerated.ErrorClass;
import com.serotonin.bacnet4j.type.enumerated.ErrorCode;
import com.serotonin.bacnet4j.type.enumerated.FileAccessMethod;
import com.serotonin.bacnet4j.type.primitive.OctetString;

/**
 * Placeholder file access instance that does nothing.
 *
 * @author Matthew
 */
public class NullFileAccess implements FileAccess {
    @Override
    public String getName() {
        return "Null";
    }

    @Override
    public boolean exists() {
        return true;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public FileAccessMethod getAccessMethod() {
        return FileAccessMethod.streamAccess;
    }

    @Override
    public long length() {
        return 0;
    }

    @Override
    public long lastModified() {
        return 0;
    }

    @Override
    public boolean canWrite() {
        return false;
    }

    @Override
    public long recordCount() {
        return 0;
    }

    @Override
    public void writeFileSize(final long fileSize) {
        // no op
    }

    @Override
    public void writeRecordCount(final long recordCount) {
        // no op
    }

    @Override
    public boolean supportsStreamAccess() {
        return true;
    }

    @Override
    public OctetString readData(final long start, final long length) throws IOException, BACnetServiceException {
        return new OctetString(new byte[0]);
    }

    @Override
    public long writeData(final long start, final OctetString data) throws IOException, BACnetServiceException {
        return 0;
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
    public long writeRecords(final long start, final SequenceOf<OctetString> records)
            throws IOException, BACnetServiceException {
        throw new BACnetServiceException(ErrorClass.services, ErrorCode.invalidFileAccessMethod);
    }
}
