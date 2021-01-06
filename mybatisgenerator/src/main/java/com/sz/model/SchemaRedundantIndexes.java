package com.sz.model;

public class SchemaRedundantIndexes {
    private String tableSchema;

    private String tableName;

    private String redundantIndexName;

    private Long redundantIndexNonUnique;

    private String dominantIndexName;

    private Long dominantIndexNonUnique;

    private Integer subpartExists;

    private String sqlDropIndex;

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

    public String getRedundantIndexName() {
        return redundantIndexName;
    }

    public void setRedundantIndexName(String redundantIndexName) {
        this.redundantIndexName = redundantIndexName == null ? null : redundantIndexName.trim();
    }

    public Long getRedundantIndexNonUnique() {
        return redundantIndexNonUnique;
    }

    public void setRedundantIndexNonUnique(Long redundantIndexNonUnique) {
        this.redundantIndexNonUnique = redundantIndexNonUnique;
    }

    public String getDominantIndexName() {
        return dominantIndexName;
    }

    public void setDominantIndexName(String dominantIndexName) {
        this.dominantIndexName = dominantIndexName == null ? null : dominantIndexName.trim();
    }

    public Long getDominantIndexNonUnique() {
        return dominantIndexNonUnique;
    }

    public void setDominantIndexNonUnique(Long dominantIndexNonUnique) {
        this.dominantIndexNonUnique = dominantIndexNonUnique;
    }

    public Integer getSubpartExists() {
        return subpartExists;
    }

    public void setSubpartExists(Integer subpartExists) {
        this.subpartExists = subpartExists;
    }

    public String getSqlDropIndex() {
        return sqlDropIndex;
    }

    public void setSqlDropIndex(String sqlDropIndex) {
        this.sqlDropIndex = sqlDropIndex == null ? null : sqlDropIndex.trim();
    }
}