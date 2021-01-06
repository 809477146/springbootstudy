package com.sz.model;

public class SchemaRedundantIndexesWithBLOBs extends SchemaRedundantIndexes {
    private String redundantIndexColumns;

    private String dominantIndexColumns;

    public String getRedundantIndexColumns() {
        return redundantIndexColumns;
    }

    public void setRedundantIndexColumns(String redundantIndexColumns) {
        this.redundantIndexColumns = redundantIndexColumns == null ? null : redundantIndexColumns.trim();
    }

    public String getDominantIndexColumns() {
        return dominantIndexColumns;
    }

    public void setDominantIndexColumns(String dominantIndexColumns) {
        this.dominantIndexColumns = dominantIndexColumns == null ? null : dominantIndexColumns.trim();
    }
}