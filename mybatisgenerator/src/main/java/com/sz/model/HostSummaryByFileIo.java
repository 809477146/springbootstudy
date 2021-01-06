package com.sz.model;

import java.math.BigDecimal;

public class HostSummaryByFileIo {
    private String host;

    private BigDecimal ios;

    private String ioLatency;

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

    public String getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(String ioLatency) {
        this.ioLatency = ioLatency == null ? null : ioLatency.trim();
    }
}