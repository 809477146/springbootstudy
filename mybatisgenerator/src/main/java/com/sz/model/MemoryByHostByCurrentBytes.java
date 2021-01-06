package com.sz.model;

import java.math.BigDecimal;

public class MemoryByHostByCurrentBytes {
    private String host;

    private BigDecimal currentCountUsed;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public BigDecimal getCurrentCountUsed() {
        return currentCountUsed;
    }

    public void setCurrentCountUsed(BigDecimal currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }
}