package com.sz.model;

import java.math.BigDecimal;

public class XHostSummary {
    private String host;

    private BigDecimal statements;

    private BigDecimal statementLatency;

    private BigDecimal statementAvgLatency;

    private BigDecimal tableScans;

    private BigDecimal fileIos;

    private BigDecimal fileIoLatency;

    private BigDecimal currentConnections;

    private BigDecimal totalConnections;

    private Long uniqueUsers;

    private BigDecimal currentMemory;

    private BigDecimal totalMemoryAllocated;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public BigDecimal getStatements() {
        return statements;
    }

    public void setStatements(BigDecimal statements) {
        this.statements = statements;
    }

    public BigDecimal getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(BigDecimal statementLatency) {
        this.statementLatency = statementLatency;
    }

    public BigDecimal getStatementAvgLatency() {
        return statementAvgLatency;
    }

    public void setStatementAvgLatency(BigDecimal statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }

    public BigDecimal getTableScans() {
        return tableScans;
    }

    public void setTableScans(BigDecimal tableScans) {
        this.tableScans = tableScans;
    }

    public BigDecimal getFileIos() {
        return fileIos;
    }

    public void setFileIos(BigDecimal fileIos) {
        this.fileIos = fileIos;
    }

    public BigDecimal getFileIoLatency() {
        return fileIoLatency;
    }

    public void setFileIoLatency(BigDecimal fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }

    public BigDecimal getCurrentConnections() {
        return currentConnections;
    }

    public void setCurrentConnections(BigDecimal currentConnections) {
        this.currentConnections = currentConnections;
    }

    public BigDecimal getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(BigDecimal totalConnections) {
        this.totalConnections = totalConnections;
    }

    public Long getUniqueUsers() {
        return uniqueUsers;
    }

    public void setUniqueUsers(Long uniqueUsers) {
        this.uniqueUsers = uniqueUsers;
    }

    public BigDecimal getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(BigDecimal currentMemory) {
        this.currentMemory = currentMemory;
    }

    public BigDecimal getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    public void setTotalMemoryAllocated(BigDecimal totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }
}