package com.sz.model;

import java.math.BigDecimal;

public class MemoryByUserByCurrentBytes {
    private String user;

    private BigDecimal currentCountUsed;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public BigDecimal getCurrentCountUsed() {
        return currentCountUsed;
    }

    public void setCurrentCountUsed(BigDecimal currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }
}