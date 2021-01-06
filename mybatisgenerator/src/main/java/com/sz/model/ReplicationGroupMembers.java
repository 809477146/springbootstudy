package com.sz.model;

public class ReplicationGroupMembers {
    private String channelName;

    private String memberId;

    private String memberHost;

    private Integer memberPort;

    private String memberState;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMemberHost() {
        return memberHost;
    }

    public void setMemberHost(String memberHost) {
        this.memberHost = memberHost == null ? null : memberHost.trim();
    }

    public Integer getMemberPort() {
        return memberPort;
    }

    public void setMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
    }

    public String getMemberState() {
        return memberState;
    }

    public void setMemberState(String memberState) {
        this.memberState = memberState == null ? null : memberState.trim();
    }
}