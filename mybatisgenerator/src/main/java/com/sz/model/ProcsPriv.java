package com.sz.model;

import java.util.Date;

public class ProcsPriv extends ProcsPrivKey {
    private String grantor;

    private String procPriv;

    private Date timestamp;

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor == null ? null : grantor.trim();
    }

    public String getProcPriv() {
        return procPriv;
    }

    public void setProcPriv(String procPriv) {
        this.procPriv = procPriv == null ? null : procPriv.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}