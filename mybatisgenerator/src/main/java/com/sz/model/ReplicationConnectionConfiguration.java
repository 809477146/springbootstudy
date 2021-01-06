package com.sz.model;

public class ReplicationConnectionConfiguration {
    private String channelName;

    private String host;

    private Integer port;

    private String user;

    private String networkInterface;

    private String autoPosition;

    private String sslAllowed;

    private String sslCaFile;

    private String sslCaPath;

    private String sslCertificate;

    private String sslCipher;

    private String sslKey;

    private String sslVerifyServerCertificate;

    private String sslCrlFile;

    private String sslCrlPath;

    private Integer connectionRetryInterval;

    private Long connectionRetryCount;

    private Double heartbeatInterval;

    private String tlsVersion;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getNetworkInterface() {
        return networkInterface;
    }

    public void setNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface == null ? null : networkInterface.trim();
    }

    public String getAutoPosition() {
        return autoPosition;
    }

    public void setAutoPosition(String autoPosition) {
        this.autoPosition = autoPosition == null ? null : autoPosition.trim();
    }

    public String getSslAllowed() {
        return sslAllowed;
    }

    public void setSslAllowed(String sslAllowed) {
        this.sslAllowed = sslAllowed == null ? null : sslAllowed.trim();
    }

    public String getSslCaFile() {
        return sslCaFile;
    }

    public void setSslCaFile(String sslCaFile) {
        this.sslCaFile = sslCaFile == null ? null : sslCaFile.trim();
    }

    public String getSslCaPath() {
        return sslCaPath;
    }

    public void setSslCaPath(String sslCaPath) {
        this.sslCaPath = sslCaPath == null ? null : sslCaPath.trim();
    }

    public String getSslCertificate() {
        return sslCertificate;
    }

    public void setSslCertificate(String sslCertificate) {
        this.sslCertificate = sslCertificate == null ? null : sslCertificate.trim();
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher == null ? null : sslCipher.trim();
    }

    public String getSslKey() {
        return sslKey;
    }

    public void setSslKey(String sslKey) {
        this.sslKey = sslKey == null ? null : sslKey.trim();
    }

    public String getSslVerifyServerCertificate() {
        return sslVerifyServerCertificate;
    }

    public void setSslVerifyServerCertificate(String sslVerifyServerCertificate) {
        this.sslVerifyServerCertificate = sslVerifyServerCertificate == null ? null : sslVerifyServerCertificate.trim();
    }

    public String getSslCrlFile() {
        return sslCrlFile;
    }

    public void setSslCrlFile(String sslCrlFile) {
        this.sslCrlFile = sslCrlFile == null ? null : sslCrlFile.trim();
    }

    public String getSslCrlPath() {
        return sslCrlPath;
    }

    public void setSslCrlPath(String sslCrlPath) {
        this.sslCrlPath = sslCrlPath == null ? null : sslCrlPath.trim();
    }

    public Integer getConnectionRetryInterval() {
        return connectionRetryInterval;
    }

    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    public Long getConnectionRetryCount() {
        return connectionRetryCount;
    }

    public void setConnectionRetryCount(Long connectionRetryCount) {
        this.connectionRetryCount = connectionRetryCount;
    }

    public Double getHeartbeatInterval() {
        return heartbeatInterval;
    }

    public void setHeartbeatInterval(Double heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    public String getTlsVersion() {
        return tlsVersion;
    }

    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion == null ? null : tlsVersion.trim();
    }
}