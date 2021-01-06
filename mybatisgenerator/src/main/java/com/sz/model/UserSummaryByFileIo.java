package com.sz.model;

import java.math.BigDecimal;

public class UserSummaryByFileIo {
    private String user;

    private BigDecimal ios;

    private String ioLatency;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public BigDecimal getIos() {
        return ios;
    }

    public void setIos(BigDecimal ios) {
        this.ios = ios;
    }

    public String getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(String ioLatency) {
        this.ioLatency = ioLatency == null ? null : ioLatency.trim();
    }
}