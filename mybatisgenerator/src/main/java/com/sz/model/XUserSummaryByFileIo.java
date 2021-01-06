package com.sz.model;

import java.math.BigDecimal;

public class XUserSummaryByFileIo {
    private String user;

    private BigDecimal ios;

    private BigDecimal ioLatency;

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

    public BigDecimal getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(BigDecimal ioLatency) {
        this.ioLatency = ioLatency;
    }
}