package com.sz.model;

import java.math.BigDecimal;

public class XPsDigestAvgLatencyDistribution {
    private Long cnt;

    private BigDecimal avgUs;

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public BigDecimal getAvgUs() {
        return avgUs;
    }

    public void setAvgUs(BigDecimal avgUs) {
        this.avgUs = avgUs;
    }
}