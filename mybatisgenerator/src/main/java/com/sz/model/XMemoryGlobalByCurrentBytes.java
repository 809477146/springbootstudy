package com.sz.model;

import java.math.BigDecimal;

public class XMemoryGlobalByCurrentBytes {
    private String eventName;

    private Long currentCount;

    private Long currentAlloc;

    private BigDecimal currentAvgAlloc;

    private Long highCount;

    private Long highAlloc;

    private BigDecimal highAvgAlloc;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public Long getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    public Long getCurrentAlloc() {
        return currentAlloc;
    }

    public void setCurrentAlloc(Long currentAlloc) {
        this.currentAlloc = currentAlloc;
    }

    public BigDecimal getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    public Long getHighCount() {
        return highCount;
    }

    public void setHighCount(Long highCount) {
        this.highCount = highCount;
    }

    public Long getHighAlloc() {
        return highAlloc;
    }

    public void setHighAlloc(Long highAlloc) {
        this.highAlloc = highAlloc;
    }

    public BigDecimal getHighAvgAlloc() {
        return highAvgAlloc;
    }

    public void setHighAvgAlloc(BigDecimal highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }
}