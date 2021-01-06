package com.sz.model;

public class InnodbSysColumns {
    private Long tableId;

    private String name;

    private Long pos;

    private Integer mtype;

    private Integer prtype;

    private Integer len;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPos() {
        return pos;
    }

    public void setPos(Long pos) {
        this.pos = pos;
    }

    public Integer getMtype() {
        return mtype;
    }

    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    public Integer getPrtype() {
        return prtype;
    }

    public void setPrtype(Integer prtype) {
        this.prtype = prtype;
    }

    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }
}