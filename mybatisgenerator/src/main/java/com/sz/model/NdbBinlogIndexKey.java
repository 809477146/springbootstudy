package com.sz.model;

public class NdbBinlogIndexKey {
    private Long epoch;

    private Integer origServerId;

    private Long origEpoch;

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    public Integer getOrigServerId() {
        return origServerId;
    }

    public void setOrigServerId(Integer origServerId) {
        this.origServerId = origServerId;
    }

    public Long getOrigEpoch() {
        return origEpoch;
    }

    public void setOrigEpoch(Long origEpoch) {
        this.origEpoch = origEpoch;
    }
}