package com.sz.model;

import java.math.BigDecimal;

public class XHostSummaryByFileIo {
    private String host;

    private BigDecimal ios;

    private BigDecimal ioLatency;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
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