package com.sz.model;

public class MemorySummaryGlobalByEventName {
    private String eventName;

    private Long countAlloc;

    private Long countFree;

    private Long sumNumberOfBytesAlloc;

    private Long sumNumberOfBytesFree;

    private Long lowCountUsed;

    private Long currentCountUsed;

    private Long highCountUsed;

    private Long lowNumberOfBytesUsed;

    private Long currentNumberOfBytesUsed;

    private Long highNumberOfBytesUsed;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public Long getCountAlloc() {
        return countAlloc;
    }

    public void setCountAlloc(Long countAlloc) {
        this.countAlloc = countAlloc;
    }

    public Long getCountFree() {
        return countFree;
    }

    public void setCountFree(Long countFree) {
        this.countFree = countFree;
    }

    public Long getSumNumberOfBytesAlloc() {
        return sumNumberOfBytesAlloc;
    }

    public void setSumNumberOfBytesAlloc(Long sumNumberOfBytesAlloc) {
        this.sumNumberOfBytesAlloc = sumNumberOfBytesAlloc;
    }

    public Long getSumNumberOfBytesFree() {
        return sumNumberOfBytesFree;
    }

    public void setSumNumberOfBytesFree(Long sumNumberOfBytesFree) {
        this.sumNumberOfBytesFree = sumNumberOfBytesFree;
    }

    public Long getLowCountUsed() {
        return lowCountUsed;
    }

    public void setLowCountUsed(Long lowCountUsed) {
        this.lowCountUsed = lowCountUsed;
    }

    public Long getCurrentCountUsed() {
        return currentCountUsed;
    }

    public void setCurrentCountUsed(Long currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }

    public Long getHighCountUsed() {
        return highCountUsed;
    }

    public void setHighCountUsed(Long highCountUsed) {
        this.highCountUsed = highCountUsed;
    }

    public Long getLowNumberOfBytesUsed() {
        return lowNumberOfBytesUsed;
    }

    public void setLowNumberOfBytesUsed(Long lowNumberOfBytesUsed) {
        this.lowNumberOfBytesUsed = lowNumberOfBytesUsed;
    }

    public Long getCurrentNumberOfBytesUsed() {
        return currentNumberOfBytesUsed;
    }

    public void setCurrentNumberOfBytesUsed(Long currentNumberOfBytesUsed) {
        this.currentNumberOfBytesUsed = currentNumberOfBytesUsed;
    }

    public Long getHighNumberOfBytesUsed() {
        return highNumberOfBytesUsed;
    }

    public void setHighNumberOfBytesUsed(Long highNumberOfBytesUsed) {
        this.highNumberOfBytesUsed = highNumberOfBytesUsed;
    }
}