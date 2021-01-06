package com.sz.model;

public class GtidExecutedKey {
    private String sourceUuid;

    private Long intervalStart;

    public String getSourceUuid() {
        return sourceUuid;
    }

    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid == null ? null : sourceUuid.trim();
    }

    public Long getIntervalStart() {
        return intervalStart;
    }

    public void setIntervalStart(Long intervalStart) {
        this.intervalStart = intervalStart;
    }
}