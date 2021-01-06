package com.sz.model;

import java.util.Date;

public class ProxiesPriv extends ProxiesPrivKey {
    private Boolean withGrant;

    private String grantor;

    private Date timestamp;

    public Boolean getWithGrant() {
        return withGrant;
    }

    public void setWithGrant(Boolean withGrant) {
        this.withGrant = withGrant;
    }

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
}