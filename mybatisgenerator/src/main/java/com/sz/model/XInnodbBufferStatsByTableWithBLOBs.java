package com.sz.model;

public class XInnodbBufferStatsByTableWithBLOBs extends XInnodbBufferStatsByTable {
    private String objectSchema;

    private String objectName;

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
}