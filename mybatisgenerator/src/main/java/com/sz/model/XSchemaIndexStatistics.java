package com.sz.model;

public class XSchemaIndexStatistics {
    private String tableSchema;

    private String tableName;

    private String indexName;

    private Long rowsSelected;

    private Long selectLatency;

    private Long rowsInserted;

    private Long insertLatency;

    private Long rowsUpdated;

    private Long updateLatency;

    private Long rowsDeleted;

    private Long deleteLatency;

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

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    public Long getRowsSelected() {
        return rowsSelected;
    }

    public void setRowsSelected(Long rowsSelected) {
        this.rowsSelected = rowsSelected;
    }

    public Long getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(Long selectLatency) {
        this.selectLatency = selectLatency;
    }

    public Long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public Long getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(Long insertLatency) {
        this.insertLatency = insertLatency;
    }

    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public Long getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(Long updateLatency) {
        this.updateLatency = updateLatency;
    }

    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public Long getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(Long deleteLatency) {
        this.deleteLatency = deleteLatency;
    }
}