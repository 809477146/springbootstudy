package com.sz.model;

public class SlaveWorkerInfo extends SlaveWorkerInfoKey {
    private Long relayLogPos;

    private Long masterLogPos;

    private Long checkpointRelayLogPos;

    private Long checkpointMasterLogPos;

    private Integer checkpointSeqno;

    private Integer checkpointGroupSize;

    public Long getRelayLogPos() {
        return relayLogPos;
    }

    public void setRelayLogPos(Long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    public Long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    public Long getCheckpointRelayLogPos() {
        return checkpointRelayLogPos;
    }

    public void setCheckpointRelayLogPos(Long checkpointRelayLogPos) {
        this.checkpointRelayLogPos = checkpointRelayLogPos;
    }

    public Long getCheckpointMasterLogPos() {
        return checkpointMasterLogPos;
    }

    public void setCheckpointMasterLogPos(Long checkpointMasterLogPos) {
        this.checkpointMasterLogPos = checkpointMasterLogPos;
    }

    public Integer getCheckpointSeqno() {
        return checkpointSeqno;
    }

    public void setCheckpointSeqno(Integer checkpointSeqno) {
        this.checkpointSeqno = checkpointSeqno;
    }

    public Integer getCheckpointGroupSize() {
        return checkpointGroupSize;
    }

    public void setCheckpointGroupSize(Integer checkpointGroupSize) {
        this.checkpointGroupSize = checkpointGroupSize;
    }
}