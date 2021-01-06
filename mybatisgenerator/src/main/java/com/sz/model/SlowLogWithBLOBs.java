package com.sz.model;

public class SlowLogWithBLOBs extends SlowLog {
    private String userHost;

    private byte[] sqlText;

    public String getUserHost() {
        return userHost;
    }

    public void setUserHost(String userHost) {
        this.userHost = userHost == null ? null : userHost.trim();
    }

    public byte[] getSqlText() {
        return sqlText;
    }

    public void setSqlText(byte[] sqlText) {
        this.sqlText = sqlText;
    }
}