package com.sz.model;

public class MemoryByHostByCurrentBytesWithBLOBs extends MemoryByHostByCurrentBytes {
    private String currentAllocated;

    private String currentAvgAlloc;

    private String currentMaxAlloc;

    private String totalAllocated;

    public String getCurrentAllocated() {
        return currentAllocated;
    }

    public void setCurrentAllocated(String currentAllocated) {
        this.currentAllocated = currentAllocated == null ? null : currentAllocated.trim();
    }

    public String getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(String currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc == null ? null : currentAvgAlloc.trim();
    }

    public String getCurrentMaxAlloc() {
        return currentMaxAlloc;
    }

    public void setCurrentMaxAlloc(String currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc == null ? null : currentMaxAlloc.trim();
    }

    public String getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(String totalAllocated) {
        this.totalAllocated = totalAllocated == null ? null : totalAllocated.trim();
    }
}