package com.sz.model;

import java.util.Date;

public class TablesPriv extends TablesPrivKey {
    private String grantor;

    private Date timestamp;

    private String tablePriv;

    private String columnPriv;

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor == null ? null : grantor.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getTablePriv() {
        return tablePriv;
    }

    public void setTablePriv(String tablePriv) {
        this.tablePriv = tablePriv == null ? null : tablePriv.trim();
    }

    public String getColumnPriv() {
        return columnPriv;
    }

    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv == null ? null : columnPriv.trim();
    }
}