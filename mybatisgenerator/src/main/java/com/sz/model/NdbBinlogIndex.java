package com.sz.model;

public class NdbBinlogIndex extends NdbBinlogIndexKey {
    private Long position;

    private String file;

    private Integer inserts;

    private Integer updates;

    private Integer deletes;

    private Integer schemaops;

    private Integer gci;

    private Long nextPosition;

    private String nextFile;

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Integer getInserts() {
        return inserts;
    }

    public void setInserts(Integer inserts) {
        this.inserts = inserts;
    }

    public Integer getUpdates() {
        return updates;
    }

    public void setUpdates(Integer updates) {
        this.updates = updates;
    }

    public Integer getDeletes() {
        return deletes;
    }

    public void setDeletes(Integer deletes) {
        this.deletes = deletes;
    }

    public Integer getSchemaops() {
        return schemaops;
    }

    public void setSchemaops(Integer schemaops) {
        this.schemaops = schemaops;
    }

    public Integer getGci() {
        return gci;
    }

    public void setGci(Integer gci) {
        this.gci = gci;
    }

    public Long getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(Long nextPosition) {
        this.nextPosition = nextPosition;
    }

    public String getNextFile() {
        return nextFile;
    }

    public void setNextFile(String nextFile) {
        this.nextFile = nextFile == null ? null : nextFile.trim();
    }
}