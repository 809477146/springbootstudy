package com.sz.model;

public class TableHandles {
    private String objectType;

    private String objectSchema;

    private String objectName;

    private Long objectInstanceBegin;

    private Long ownerThreadId;

    private Long ownerEventId;

    private String internalLock;

    private String externalLock;

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

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

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    public Long getOwnerEventId() {
        return ownerEventId;
    }

    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    public String getInternalLock() {
        return internalLock;
    }

    public void setInternalLock(String internalLock) {
        this.internalLock = internalLock == null ? null : internalLock.trim();
    }

    public String getExternalLock() {
        return externalLock;
    }

    public void setExternalLock(String externalLock) {
        this.externalLock = externalLock == null ? null : externalLock.trim();
    }
}