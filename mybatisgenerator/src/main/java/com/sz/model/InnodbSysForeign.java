package com.sz.model;

public class InnodbSysForeign {
    private String id;

    private String forName;

    private String refName;

    private Integer nCols;

    private Integer type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName == null ? null : forName.trim();
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName == null ? null : refName.trim();
    }

    public Integer getnCols() {
        return nCols;
    }

    public void setnCols(Integer nCols) {
        this.nCols = nCols;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}