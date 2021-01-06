package com.sz.model;

public class HostSummaryByFileIoTypeWithBLOBs extends HostSummaryByFileIoType {
    private String totalLatency;

    private String maxLatency;

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency == null ? null : maxLatency.trim();
    }
}