package com.sz.model;

import java.util.Date;

public class ColumnsPriv extends ColumnsPrivKey {
    private Date timestamp;

    private String columnPriv;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getColumnPriv() {
        return columnPriv;
    }

    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv == null ? null : columnPriv.trim();
    }
}