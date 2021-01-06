package com.sz.model;

public class RwlockInstances {
    private String name;

    private Long objectInstanceBegin;

    private Long writeLockedByThreadId;

    private Integer readLockedByCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public Long getWriteLockedByThreadId() {
        return writeLockedByThreadId;
    }

    public void setWriteLockedByThreadId(Long writeLockedByThreadId) {
        this.writeLockedByThreadId = writeLockedByThreadId;
    }

    public Integer getReadLockedByCount() {
        return readLockedByCount;
    }

    public void setReadLockedByCount(Integer readLockedByCount) {
        this.readLockedByCount = readLockedByCount;
    }
}