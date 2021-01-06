package com.sz.model;

import java.math.BigDecimal;

public class XPsSchemaTableStatisticsIo {
    private String tableSchema;

    private String tableName;

    private BigDecimal countRead;

    private BigDecimal sumNumberOfBytesRead;

    private BigDecimal sumTimerRead;

    private BigDecimal countWrite;

    private BigDecimal sumNumberOfBytesWrite;

    private BigDecimal sumTimerWrite;

    private BigDecimal countMisc;

    private BigDecimal sumTimerMisc;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public BigDecimal getCountRead() {
        return countRead;
    }

    public void setCountRead(BigDecimal countRead) {
        this.countRead = countRead;
    }

    public BigDecimal getSumNumberOfBytesRead() {
        return sumNumberOfBytesRead;
    }

    public void setSumNumberOfBytesRead(BigDecimal sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }

    public BigDecimal getSumTimerRead() {
        return sumTimerRead;
    }

    public void setSumTimerRead(BigDecimal sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    public BigDecimal getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(BigDecimal countWrite) {
        this.countWrite = countWrite;
    }

    public BigDecimal getSumNumberOfBytesWrite() {
        return sumNumberOfBytesWrite;
    }

    public void setSumNumberOfBytesWrite(BigDecimal sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }

    public BigDecimal getSumTimerWrite() {
        return sumTimerWrite;
    }

    public void setSumTimerWrite(BigDecimal sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    public BigDecimal getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(BigDecimal countMisc) {
        this.countMisc = countMisc;
    }

    public BigDecimal getSumTimerMisc() {
        return sumTimerMisc;
    }

    public void setSumTimerMisc(BigDecimal sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }
}