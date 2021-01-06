package com.sz.model;

public class MemoryGlobalByCurrentBytesWithBLOBs extends MemoryGlobalByCurrentBytes {
    private String currentAlloc;

    private String currentAvgAlloc;

    private String highAlloc;

    private String highAvgAlloc;

    public String getCurrentAlloc() {
        return currentAlloc;
    }

    public void setCurrentAlloc(String currentAlloc) {
        this.currentAlloc = currentAlloc == null ? null : currentAlloc.trim();
    }

    public String getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(String currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc == null ? null : currentAvgAlloc.trim();
    }

    public String getHighAlloc() {
        return highAlloc;
    }

    public void setHighAlloc(String highAlloc) {
        this.highAlloc = highAlloc == null ? null : highAlloc.trim();
    }

    public String getHighAvgAlloc() {
        return highAvgAlloc;
    }

    public void setHighAvgAlloc(String highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc == null ? null : highAvgAlloc.trim();
    }
}