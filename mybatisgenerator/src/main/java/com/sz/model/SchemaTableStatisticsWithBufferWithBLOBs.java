package com.sz.model;

public class SchemaTableStatisticsWithBufferWithBLOBs extends SchemaTableStatisticsWithBuffer {
    private String fetchLatency;

    private String insertLatency;

    private String updateLatency;

    private String deleteLatency;

    private String ioRead;

    private String ioReadLatency;

    private String ioWrite;

    private String ioWriteLatency;

    private String ioMiscLatency;

    private String innodbBufferAllocated;

    private String innodbBufferData;

    private String innodbBufferFree;

    public String getFetchLatency() {
        return fetchLatency;
    }

    public void setFetchLatency(String fetchLatency) {
        this.fetchLatency = fetchLatency == null ? null : fetchLatency.trim();
    }

    public String getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency == null ? null : insertLatency.trim();
    }

    public String getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency == null ? null : updateLatency.trim();
    }

    public String getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency == null ? null : deleteLatency.trim();
    }

    public String getIoRead() {
        return ioRead;
    }

    public void setIoRead(String ioRead) {
        this.ioRead = ioRead == null ? null : ioRead.trim();
    }

    public String getIoReadLatency() {
        return ioReadLatency;
    }

    public void setIoReadLatency(String ioReadLatency) {
        this.ioReadLatency = ioReadLatency == null ? null : ioReadLatency.trim();
    }

    public String getIoWrite() {
        return ioWrite;
    }

    public void setIoWrite(String ioWrite) {
        this.ioWrite = ioWrite == null ? null : ioWrite.trim();
    }

    public String getIoWriteLatency() {
        return ioWriteLatency;
    }

    public void setIoWriteLatency(String ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency == null ? null : ioWriteLatency.trim();
    }

    public String getIoMiscLatency() {
        return ioMiscLatency;
    }

    public void setIoMiscLatency(String ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency == null ? null : ioMiscLatency.trim();
    }

    public String getInnodbBufferAllocated() {
        return innodbBufferAllocated;
    }

    public void setInnodbBufferAllocated(String innodbBufferAllocated) {
        this.innodbBufferAllocated = innodbBufferAllocated == null ? null : innodbBufferAllocated.trim();
    }

    public String getInnodbBufferData() {
        return innodbBufferData;
    }

    public void setInnodbBufferData(String innodbBufferData) {
        this.innodbBufferData = innodbBufferData == null ? null : innodbBufferData.trim();
    }

    public String getInnodbBufferFree() {
        return innodbBufferFree;
    }

    public void setInnodbBufferFree(String innodbBufferFree) {
        this.innodbBufferFree = innodbBufferFree == null ? null : innodbBufferFree.trim();
    }
}