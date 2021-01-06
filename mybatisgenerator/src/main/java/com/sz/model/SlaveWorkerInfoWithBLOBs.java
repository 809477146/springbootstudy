package com.sz.model;

public class SlaveWorkerInfoWithBLOBs extends SlaveWorkerInfo {
    private String relayLogName;

    private String masterLogName;

    private String checkpointRelayLogName;

    private String checkpointMasterLogName;

    private byte[] checkpointGroupBitmap;

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

    public String getCheckpointRelayLogName() {
        return checkpointRelayLogName;
    }

    public void setCheckpointRelayLogName(String checkpointRelayLogName) {
        this.checkpointRelayLogName = checkpointRelayLogName == null ? null : checkpointRelayLogName.trim();
    }

    public String getCheckpointMasterLogName() {
        return checkpointMasterLogName;
    }

    public void setCheckpointMasterLogName(String checkpointMasterLogName) {
        this.checkpointMasterLogName = checkpointMasterLogName == null ? null : checkpointMasterLogName.trim();
    }

    public byte[] getCheckpointGroupBitmap() {
        return checkpointGroupBitmap;
    }

    public void setCheckpointGroupBitmap(byte[] checkpointGroupBitmap) {
        this.checkpointGroupBitmap = checkpointGroupBitmap;
    }
}