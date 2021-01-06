package com.sz.model;

public class LatestFileIoWithBLOBs extends LatestFileIo {
    private String latency;

    private String requested;

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency == null ? null : latency.trim();
    }

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested == null ? null : requested.trim();
    }
}