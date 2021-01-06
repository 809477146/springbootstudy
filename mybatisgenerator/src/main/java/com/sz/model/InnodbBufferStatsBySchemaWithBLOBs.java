package com.sz.model;

public class InnodbBufferStatsBySchemaWithBLOBs extends InnodbBufferStatsBySchema {
    private String objectSchema;

    private String allocated;

    private String data;

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    public String getAllocated() {
        return allocated;
    }

    public void setAllocated(String allocated) {
        this.allocated = allocated == null ? null : allocated.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}