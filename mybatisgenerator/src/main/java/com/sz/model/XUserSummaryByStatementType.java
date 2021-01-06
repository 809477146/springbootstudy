package com.sz.model;

public class XUserSummaryByStatementType {
    private String user;

    private String statement;

    private Long total;

    private Long totalLatency;

    private Long maxLatency;

    private Long lockLatency;

    private Long rowsSent;

    private Long rowsExamined;

    private Long rowsAffected;

    private Long fullScans;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    public Long getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    public Long getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(Long lockLatency) {
        this.lockLatency = lockLatency;
    }

    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public Long getFullScans() {
        return fullScans;
    }

    public void setFullScans(Long fullScans) {
        this.fullScans = fullScans;
    }
}