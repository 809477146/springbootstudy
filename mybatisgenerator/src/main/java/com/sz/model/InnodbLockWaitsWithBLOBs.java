package com.sz.model;

public class InnodbLockWaitsWithBLOBs extends InnodbLockWaits {
    private String waitingQuery;

    private String blockingQuery;

    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery == null ? null : waitingQuery.trim();
    }

    public String getBlockingQuery() {
        return blockingQuery;
    }

    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery == null ? null : blockingQuery.trim();
    }
}