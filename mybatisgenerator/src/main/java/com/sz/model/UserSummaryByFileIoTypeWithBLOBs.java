package com.sz.model;

public class UserSummaryByFileIoTypeWithBLOBs extends UserSummaryByFileIoType {
    private String latency;

    private String maxLatency;

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency == null ? null : latency.trim();
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency == null ? null : maxLatency.trim();
    }
}