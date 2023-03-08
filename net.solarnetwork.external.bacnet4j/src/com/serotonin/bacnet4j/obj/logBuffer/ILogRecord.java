package com.serotonin.bacnet4j.obj.logBuffer;

import com.serotonin.bacnet4j.service.confirmed.ReadRangeRequest.Sequenced;
import com.serotonin.bacnet4j.service.confirmed.ReadRangeRequest.Timestamped;

/**
 * An interface that represents the various objects that can be stored in a log buffer, including LogRecord,
 * LogMultipleRecord, and EventLogRecord.
 */
public interface ILogRecord extends Timestamped, Sequenced {
    // Placeholder
}
