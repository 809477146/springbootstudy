package com.sz.model;

public class ReplicationGroupMemberStatsWithBLOBs extends ReplicationGroupMemberStats {
    private String transactionsCommittedAllMembers;

    private String lastConflictFreeTransaction;

    public String getTransactionsCommittedAllMembers() {
        return transactionsCommittedAllMembers;
    }

    public void setTransactionsCommittedAllMembers(String transactionsCommittedAllMembers) {
        this.transactionsCommittedAllMembers = transactionsCommittedAllMembers == null ? null : transactionsCommittedAllMembers.trim();
    }

    public String getLastConflictFreeTransaction() {
        return lastConflictFreeTransaction;
    }

    public void setLastConflictFreeTransaction(String lastConflictFreeTransaction) {
        this.lastConflictFreeTransaction = lastConflictFreeTransaction == null ? null : lastConflictFreeTransaction.trim();
    }
}