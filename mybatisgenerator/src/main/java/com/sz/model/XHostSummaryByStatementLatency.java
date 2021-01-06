package com.sz.model;

import java.math.BigDecimal;

public class XHostSummaryByStatementLatency {
    private String host;

    private BigDecimal total;

    private BigDecimal totalLatency;

    private Long maxLatency;

    private BigDecimal lockLatency;

    private BigDecimal rowsSent;

    private BigDecimal rowsExamined;

    private BigDecimal rowsAffected;

    private BigDecimal fullScans;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(BigDecimal totalLatency) {
        this.totalLatency = totalLatency;
    }

    public Long getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    public BigDecimal getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(BigDecimal lockLatency) {
        this.lockLatency = lockLatency;
    }

    public BigDecimal getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(BigDecimal rowsSent) {
        this.rowsSent = rowsSent;
    }

    public BigDecimal getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(BigDecimal rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public BigDecimal getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(BigDecimal rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public BigDecimal getFullScans() {
        return fullScans;
    }

    public void setFullScans(BigDecimal fullScans) {
        this.fullScans = fullScans;
    }
}