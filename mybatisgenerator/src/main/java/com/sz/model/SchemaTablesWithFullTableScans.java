package com.sz.model;

public class SchemaTablesWithFullTableScans {
    private String objectSchema;

    private String objectName;

    private Long rowsFullScanned;

    private String latency;

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public Long getRowsFullScanned() {
        return rowsFullScanned;
    }

    public void setRowsFullScanned(Long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency == null ? null : latency.trim();
    }
}