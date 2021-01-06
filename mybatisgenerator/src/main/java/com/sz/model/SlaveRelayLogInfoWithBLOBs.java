package com.sz.model;

public class SlaveRelayLogInfoWithBLOBs extends SlaveRelayLogInfo {
    private String relayLogName;

    private String masterLogName;

    public String getRelayLogName() {
        return relayLogName;
    }

    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName == null ? null : relayLogName.trim();
    }

    public String getMasterLogName() {
        return masterLogName;
    }

    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName == null ? null : masterLogName.trim();
    }
}