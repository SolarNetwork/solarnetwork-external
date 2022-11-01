package com.serotonin.bacnet4j.type;

import java.util.Arrays;

import com.serotonin.bacnet4j.exception.BACnetException;
import com.serotonin.bacnet4j.exception.BACnetServiceException;
import com.serotonin.bacnet4j.type.primitive.Boolean;
import com.serotonin.bacnet4j.util.sero.ByteQueue;
import com.serotonin.bacnet4j.util.sero.StreamUtils;

public class EncodedValue extends Encodable {
    private final byte[] data;

    public EncodedValue(final byte[] data) {
        this.data = data;
    }

    public EncodedValue(final Encodable... sequence) {
        final ByteQueue queue = new ByteQueue();
        for (final Encodable e : sequence) {
            e.write(queue);
        }
        data = queue.popAll();
    }

    public EncodedValue(final ByteQueue queue, final int contextId) throws BACnetException {
        popStart(queue, contextId);

        final TagData tagData = new TagData();
        final ByteQueue data = new ByteQueue();
        while (true) {
            peekTagData(queue, tagData);
            if (tagData.isEndTag(contextId))
                break;
            readData(queue, tagData, data);
        }
        this.data = data.popAll();

        popEnd(queue, contextId);
    }

    @Override
    public void write(final ByteQueue queue, final int contextId) {
        writeContextTag(queue, contextId, true);
        queue.push(data);
        writeContextTag(queue, contextId, false);
    }

    @Override
    public void write(final ByteQueue queue) {
        queue.push(data);
    }

    public byte[] getData() {
        return data;
    }

    private void readData(final ByteQueue queue, final TagData tagData, final ByteQueue data) {
        if (!tagData.contextSpecific) {
            // Application class.
            if (tagData.tagNumber == Boolean.TYPE_ID)
                copyData(queue, 1, data);
            else
                copyData(queue, tagData.getTotalLength(), data);
        } else {
            // Context specific class.
            if (tagData.isStartTag()) {
                // Copy the start tag
                copyData(queue, 1, data);

                // Remember the context id
                final int contextId = tagData.tagNumber;

                // Read ambiguous data until we find the end tag.
                while (true) {
                    peekTagData(queue, tagData);
                    if (tagData.isEndTag(contextId))
                        break;
                    readData(queue, tagData, data);
                }

                // Copy the end tag
                copyData(queue, 1, data);
            } else {
                copyData(queue, tagData.getTotalLength(), data);
            }
        }
    }

    @Override
    public String toString() {
        return "Encoded(" + StreamUtils.dumpArrayHex(data) + ")";
    }

    private static void copyData(final ByteQueue queue, final int length, final ByteQueue data) {
        int len = length;
        while (len-- > 0)
            data.push(queue.pop());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EncodedValue other = (EncodedValue) obj;
        if (!Arrays.equals(data, other.data))
            return false;
        return true;
    }

    @Override
    public void validate() throws BACnetServiceException {
        //Not necessary
    }
}
