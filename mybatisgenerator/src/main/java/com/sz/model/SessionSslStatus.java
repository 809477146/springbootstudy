package com.sz.model;

public class SessionSslStatus {
    private Long threadId;

    private String sslVersion;

    private String sslCipher;

    private String sslSessionsReused;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getSslVersion() {
        return sslVersion;
    }

    public void setSslVersion(String sslVersion) {
        this.sslVersion = sslVersion == null ? null : sslVersion.trim();
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher == null ? null : sslCipher.trim();
    }

    public String getSslSessionsReused() {
        return sslSessionsReused;
    }

    public void setSslSessionsReused(String sslSessionsReused) {
        this.sslSessionsReused = sslSessionsReused == null ? null : sslSessionsReused.trim();
    }
}