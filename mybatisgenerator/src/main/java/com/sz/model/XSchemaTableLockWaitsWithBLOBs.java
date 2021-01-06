package com.sz.model;

public class XSchemaTableLockWaitsWithBLOBs extends XSchemaTableLockWaits {
    private String waitingAccount;

    private String waitingQuery;

    private String blockingAccount;

    public String getWaitingAccount() {
        return waitingAccount;
    }

    public void setWaitingAccount(String waitingAccount) {
        this.waitingAccount = waitingAccount == null ? null : waitingAccount.trim();
    }

    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery == null ? null : waitingQuery.trim();
    }

    public String getBlockingAccount() {
        return blockingAccount;
    }

    public void setBlockingAccount(String blockingAccount) {
        this.blockingAccount = blockingAccount == null ? null : blockingAccount.trim();
    }
}