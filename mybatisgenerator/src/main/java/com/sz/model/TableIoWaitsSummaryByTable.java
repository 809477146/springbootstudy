package com.sz.model;

public class TableIoWaitsSummaryByTable {
    private String objectType;

    private String objectSchema;

    private String objectName;

    private Long countStar;

    private Long sumTimerWait;

    private Long minTimerWait;

    private Long avgTimerWait;

    private Long maxTimerWait;

    private Long countRead;

    private Long sumTimerRead;

    private Long minTimerRead;

    private Long avgTimerRead;

    private Long maxTimerRead;

    private Long countWrite;

    private Long sumTimerWrite;

    private Long minTimerWrite;

    private Long avgTimerWrite;

    private Long maxTimerWrite;

    private Long countFetch;

    private Long sumTimerFetch;

    private Long minTimerFetch;

    private Long avgTimerFetch;

    private Long maxTimerFetch;

    private Long countInsert;

    private Long sumTimerInsert;

    private Long minTimerInsert;

    private Long avgTimerInsert;

    private Long maxTimerInsert;

    private Long countUpdate;

    private Long sumTimerUpdate;

    private Long minTimerUpdate;

    private Long avgTimerUpdate;

    private Long maxTimerUpdate;

    private Long countDelete;

    private Long sumTimerDelete;

    private Long minTimerDelete;

    private Long avgTimerDelete;

    private Long maxTimerDelete;

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

    public Long getCountStar() {
        return countStar;
    }

    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    public Long getMinTimerWait() {
        return minTimerWait;
    }

    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    public Long getCountRead() {
        return countRead;
    }

    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    public Long getSumTimerRead() {
        return sumTimerRead;
    }

    public void setSumTimerRead(Long sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    public Long getMinTimerRead() {
        return minTimerRead;
    }

    public void setMinTimerRead(Long minTimerRead) {
        this.minTimerRead = minTimerRead;
    }

    public Long getAvgTimerRead() {
        return avgTimerRead;
    }

    public void setAvgTimerRead(Long avgTimerRead) {
        this.avgTimerRead = avgTimerRead;
    }

    public Long getMaxTimerRead() {
        return maxTimerRead;
    }

    public void setMaxTimerRead(Long maxTimerRead) {
        this.maxTimerRead = maxTimerRead;
    }

    public Long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    public Long getSumTimerWrite() {
        return sumTimerWrite;
    }

    public void setSumTimerWrite(Long sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    public Long getMinTimerWrite() {
        return minTimerWrite;
    }

    public void setMinTimerWrite(Long minTimerWrite) {
        this.minTimerWrite = minTimerWrite;
    }

    public Long getAvgTimerWrite() {
        return avgTimerWrite;
    }

    public void setAvgTimerWrite(Long avgTimerWrite) {
        this.avgTimerWrite = avgTimerWrite;
    }

    public Long getMaxTimerWrite() {
        return maxTimerWrite;
    }

    public void setMaxTimerWrite(Long maxTimerWrite) {
        this.maxTimerWrite = maxTimerWrite;
    }

    public Long getCountFetch() {
        return countFetch;
    }

    public void setCountFetch(Long countFetch) {
        this.countFetch = countFetch;
    }

    public Long getSumTimerFetch() {
        return sumTimerFetch;
    }

    public void setSumTimerFetch(Long sumTimerFetch) {
        this.sumTimerFetch = sumTimerFetch;
    }

    public Long getMinTimerFetch() {
        return minTimerFetch;
    }

    public void setMinTimerFetch(Long minTimerFetch) {
        this.minTimerFetch = minTimerFetch;
    }

    public Long getAvgTimerFetch() {
        return avgTimerFetch;
    }

    public void setAvgTimerFetch(Long avgTimerFetch) {
        this.avgTimerFetch = avgTimerFetch;
    }

    public Long getMaxTimerFetch() {
        return maxTimerFetch;
    }

    public void setMaxTimerFetch(Long maxTimerFetch) {
        this.maxTimerFetch = maxTimerFetch;
    }

    public Long getCountInsert() {
        return countInsert;
    }

    public void setCountInsert(Long countInsert) {
        this.countInsert = countInsert;
    }

    public Long getSumTimerInsert() {
        return sumTimerInsert;
    }

    public void setSumTimerInsert(Long sumTimerInsert) {
        this.sumTimerInsert = sumTimerInsert;
    }

    public Long getMinTimerInsert() {
        return minTimerInsert;
    }

    public void setMinTimerInsert(Long minTimerInsert) {
        this.minTimerInsert = minTimerInsert;
    }

    public Long getAvgTimerInsert() {
        return avgTimerInsert;
    }

    public void setAvgTimerInsert(Long avgTimerInsert) {
        this.avgTimerInsert = avgTimerInsert;
    }

    public Long getMaxTimerInsert() {
        return maxTimerInsert;
    }

    public void setMaxTimerInsert(Long maxTimerInsert) {
        this.maxTimerInsert = maxTimerInsert;
    }

    public Long getCountUpdate() {
        return countUpdate;
    }

    public void setCountUpdate(Long countUpdate) {
        this.countUpdate = countUpdate;
    }

    public Long getSumTimerUpdate() {
        return sumTimerUpdate;
    }

    public void setSumTimerUpdate(Long sumTimerUpdate) {
        this.sumTimerUpdate = sumTimerUpdate;
    }

    public Long getMinTimerUpdate() {
        return minTimerUpdate;
    }

    public void setMinTimerUpdate(Long minTimerUpdate) {
        this.minTimerUpdate = minTimerUpdate;
    }

    public Long getAvgTimerUpdate() {
        return avgTimerUpdate;
    }

    public void setAvgTimerUpdate(Long avgTimerUpdate) {
        this.avgTimerUpdate = avgTimerUpdate;
    }

    public Long getMaxTimerUpdate() {
        return maxTimerUpdate;
    }

    public void setMaxTimerUpdate(Long maxTimerUpdate) {
        this.maxTimerUpdate = maxTimerUpdate;
    }

    public Long getCountDelete() {
        return countDelete;
    }

    public void setCountDelete(Long countDelete) {
        this.countDelete = countDelete;
    }

    public Long getSumTimerDelete() {
        return sumTimerDelete;
    }

    public void setSumTimerDelete(Long sumTimerDelete) {
        this.sumTimerDelete = sumTimerDelete;
    }

    public Long getMinTimerDelete() {
        return minTimerDelete;
    }

    public void setMinTimerDelete(Long minTimerDelete) {
        this.minTimerDelete = minTimerDelete;
    }

    public Long getAvgTimerDelete() {
        return avgTimerDelete;
    }

    public void setAvgTimerDelete(Long avgTimerDelete) {
        this.avgTimerDelete = avgTimerDelete;
    }

    public Long getMaxTimerDelete() {
        return maxTimerDelete;
    }

    public void setMaxTimerDelete(Long maxTimerDelete) {
        this.maxTimerDelete = maxTimerDelete;
    }
}