package com.sz.model;

public class EventsStatementsCurrent {
    private Long threadId;

    private Long eventId;

    private Long endEventId;

    private String eventName;

    private String source;

    private Long timerStart;

    private Long timerEnd;

    private Long timerWait;

    private Long lockTime;

    private String digest;

    private String currentSchema;

    private String objectType;

    private String objectSchema;

    private String objectName;

    private Long objectInstanceBegin;

    private Integer mysqlErrno;

    private String returnedSqlstate;

    private String messageText;

    private Long errors;

    private Long warnings;

    private Long rowsAffected;

    private Long rowsSent;

    private Long rowsExamined;

    private Long createdTmpDiskTables;

    private Long createdTmpTables;

    private Long selectFullJoin;

    private Long selectFullRangeJoin;

    private Long selectRange;

    private Long selectRangeCheck;

    private Long selectScan;

    private Long sortMergePasses;

    private Long sortRange;

    private Long sortRows;

    private Long sortScan;

    private Long noIndexUsed;

    private Long noGoodIndexUsed;

    private Long nestingEventId;

    private String nestingEventType;

    private Integer nestingEventLevel;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getEndEventId() {
        return endEventId;
    }

    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Long getTimerStart() {
        return timerStart;
    }

    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    public Long getTimerEnd() {
        return timerEnd;
    }

    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    public Long getTimerWait() {
        return timerWait;
    }

    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    public Long getLockTime() {
        return lockTime;
    }

    public void setLockTime(Long lockTime) {
        this.lockTime = lockTime;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    public String getCurrentSchema() {
        return currentSchema;
    }

    public void setCurrentSchema(String currentSchema) {
        this.currentSchema = currentSchema == null ? null : currentSchema.trim();
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public Integer getMysqlErrno() {
        return mysqlErrno;
    }

    public void setMysqlErrno(Integer mysqlErrno) {
        this.mysqlErrno = mysqlErrno;
    }

    public String getReturnedSqlstate() {
        return returnedSqlstate;
    }

    public void setReturnedSqlstate(String returnedSqlstate) {
        this.returnedSqlstate = returnedSqlstate == null ? null : returnedSqlstate.trim();
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText == null ? null : messageText.trim();
    }

    public Long getErrors() {
        return errors;
    }

    public void setErrors(Long errors) {
        this.errors = errors;
    }

    public Long getWarnings() {
        return warnings;
    }

    public void setWarnings(Long warnings) {
        this.warnings = warnings;
    }

    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public Long getCreatedTmpDiskTables() {
        return createdTmpDiskTables;
    }

    public void setCreatedTmpDiskTables(Long createdTmpDiskTables) {
        this.createdTmpDiskTables = createdTmpDiskTables;
    }

    public Long getCreatedTmpTables() {
        return createdTmpTables;
    }

    public void setCreatedTmpTables(Long createdTmpTables) {
        this.createdTmpTables = createdTmpTables;
    }

    public Long getSelectFullJoin() {
        return selectFullJoin;
    }

    public void setSelectFullJoin(Long selectFullJoin) {
        this.selectFullJoin = selectFullJoin;
    }

    public Long getSelectFullRangeJoin() {
        return selectFullRangeJoin;
    }

    public void setSelectFullRangeJoin(Long selectFullRangeJoin) {
        this.selectFullRangeJoin = selectFullRangeJoin;
    }

    public Long getSelectRange() {
        return selectRange;
    }

    public void setSelectRange(Long selectRange) {
        this.selectRange = selectRange;
    }

    public Long getSelectRangeCheck() {
        return selectRangeCheck;
    }

    public void setSelectRangeCheck(Long selectRangeCheck) {
        this.selectRangeCheck = selectRangeCheck;
    }

    public Long getSelectScan() {
        return selectScan;
    }

    public void setSelectScan(Long selectScan) {
        this.selectScan = selectScan;
    }

    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    public void setSortMergePasses(Long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    public Long getSortRange() {
        return sortRange;
    }

    public void setSortRange(Long sortRange) {
        this.sortRange = sortRange;
    }

    public Long getSortRows() {
        return sortRows;
    }

    public void setSortRows(Long sortRows) {
        this.sortRows = sortRows;
    }

    public Long getSortScan() {
        return sortScan;
    }

    public void setSortScan(Long sortScan) {
        this.sortScan = sortScan;
    }

    public Long getNoIndexUsed() {
        return noIndexUsed;
    }

    public void setNoIndexUsed(Long noIndexUsed) {
        this.noIndexUsed = noIndexUsed;
    }

    public Long getNoGoodIndexUsed() {
        return noGoodIndexUsed;
    }

    public void setNoGoodIndexUsed(Long noGoodIndexUsed) {
        this.noGoodIndexUsed = noGoodIndexUsed;
    }

    public Long getNestingEventId() {
        return nestingEventId;
    }

    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    public String getNestingEventType() {
        return nestingEventType;
    }

    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType == null ? null : nestingEventType.trim();
    }

    public Integer getNestingEventLevel() {
        return nestingEventLevel;
    }

    public void setNestingEventLevel(Integer nestingEventLevel) {
        this.nestingEventLevel = nestingEventLevel;
    }
}