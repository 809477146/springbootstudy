package com.sz.model;

public class XSchemaFlattenedKeys {
    private String tableSchema;

    private String tableName;

    private String indexName;

    private Long nonUnique;

    private Long subpartExists;

    private String indexColumns;

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

    public Long getNonUnique() {
        return nonUnique;
    }

    public void setNonUnique(Long nonUnique) {
        this.nonUnique = nonUnique;
    }

    public Long getSubpartExists() {
        return subpartExists;
    }

    public void setSubpartExists(Long subpartExists) {
        this.subpartExists = subpartExists;
    }

    public String getIndexColumns() {
        return indexColumns;
    }

    public void setIndexColumns(String indexColumns) {
        this.indexColumns = indexColumns == null ? null : indexColumns.trim();
    }
}