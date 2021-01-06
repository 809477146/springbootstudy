package com.sz.model;

public class ReplicationApplierStatus {
    private String channelName;

    private String serviceState;

    private Integer remainingDelay;

    private Long countTransactionsRetries;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState == null ? null : serviceState.trim();
    }

    public Integer getRemainingDelay() {
        return remainingDelay;
    }

    public void setRemainingDelay(Integer remainingDelay) {
        this.remainingDelay = remainingDelay;
    }

    public Long getCountTransactionsRetries() {
        return countTransactionsRetries;
    }

    public void setCountTransactionsRetries(Long countTransactionsRetries) {
        this.countTransactionsRetries = countTransactionsRetries;
    }
}