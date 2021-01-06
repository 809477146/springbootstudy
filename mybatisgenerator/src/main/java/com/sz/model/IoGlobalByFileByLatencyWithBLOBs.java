package com.sz.model;

public class IoGlobalByFileByLatencyWithBLOBs extends IoGlobalByFileByLatency {
    private String totalLatency;

    private String readLatency;

    private String writeLatency;

    private String miscLatency;

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    public String getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(String readLatency) {
        this.readLatency = readLatency == null ? null : readLatency.trim();
    }

    public String getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(String writeLatency) {
        this.writeLatency = writeLatency == null ? null : writeLatency.trim();
    }

    public String getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(String miscLatency) {
        this.miscLatency = miscLatency == null ? null : miscLatency.trim();
    }
}