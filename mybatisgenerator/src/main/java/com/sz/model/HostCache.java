package com.sz.model;

import java.util.Date;

public class HostCache {
    private String ip;

    private String host;

    private String hostValidated;

    private Long sumConnectErrors;

    private Long countHostBlockedErrors;

    private Long countNameinfoTransientErrors;

    private Long countNameinfoPermanentErrors;

    private Long countFormatErrors;

    private Long countAddrinfoTransientErrors;

    private Long countAddrinfoPermanentErrors;

    private Long countFcrdnsErrors;

    private Long countHostAclErrors;

    private Long countNoAuthPluginErrors;

    private Long countAuthPluginErrors;

    private Long countHandshakeErrors;

    private Long countProxyUserErrors;

    private Long countProxyUserAclErrors;

    private Long countAuthenticationErrors;

    private Long countSslErrors;

    private Long countMaxUserConnectionsErrors;

    private Long countMaxUserConnectionsPerHourErrors;

    private Long countDefaultDatabaseErrors;

    private Long countInitConnectErrors;

    private Long countLocalErrors;

    private Long countUnknownErrors;

    private Date firstSeen;

    private Date lastSeen;

    private Date firstErrorSeen;

    private Date lastErrorSeen;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getHostValidated() {
        return hostValidated;
    }

    public void setHostValidated(String hostValidated) {
        this.hostValidated = hostValidated == null ? null : hostValidated.trim();
    }

    public Long getSumConnectErrors() {
        return sumConnectErrors;
    }

    public void setSumConnectErrors(Long sumConnectErrors) {
        this.sumConnectErrors = sumConnectErrors;
    }

    public Long getCountHostBlockedErrors() {
        return countHostBlockedErrors;
    }

    public void setCountHostBlockedErrors(Long countHostBlockedErrors) {
        this.countHostBlockedErrors = countHostBlockedErrors;
    }

    public Long getCountNameinfoTransientErrors() {
        return countNameinfoTransientErrors;
    }

    public void setCountNameinfoTransientErrors(Long countNameinfoTransientErrors) {
        this.countNameinfoTransientErrors = countNameinfoTransientErrors;
    }

    public Long getCountNameinfoPermanentErrors() {
        return countNameinfoPermanentErrors;
    }

    public void setCountNameinfoPermanentErrors(Long countNameinfoPermanentErrors) {
        this.countNameinfoPermanentErrors = countNameinfoPermanentErrors;
    }

    public Long getCountFormatErrors() {
        return countFormatErrors;
    }

    public void setCountFormatErrors(Long countFormatErrors) {
        this.countFormatErrors = countFormatErrors;
    }

    public Long getCountAddrinfoTransientErrors() {
        return countAddrinfoTransientErrors;
    }

    public void setCountAddrinfoTransientErrors(Long countAddrinfoTransientErrors) {
        this.countAddrinfoTransientErrors = countAddrinfoTransientErrors;
    }

    public Long getCountAddrinfoPermanentErrors() {
        return countAddrinfoPermanentErrors;
    }

    public void setCountAddrinfoPermanentErrors(Long countAddrinfoPermanentErrors) {
        this.countAddrinfoPermanentErrors = countAddrinfoPermanentErrors;
    }

    public Long getCountFcrdnsErrors() {
        return countFcrdnsErrors;
    }

    public void setCountFcrdnsErrors(Long countFcrdnsErrors) {
        this.countFcrdnsErrors = countFcrdnsErrors;
    }

    public Long getCountHostAclErrors() {
        return countHostAclErrors;
    }

    public void setCountHostAclErrors(Long countHostAclErrors) {
        this.countHostAclErrors = countHostAclErrors;
    }

    public Long getCountNoAuthPluginErrors() {
        return countNoAuthPluginErrors;
    }

    public void setCountNoAuthPluginErrors(Long countNoAuthPluginErrors) {
        this.countNoAuthPluginErrors = countNoAuthPluginErrors;
    }

    public Long getCountAuthPluginErrors() {
        return countAuthPluginErrors;
    }

    public void setCountAuthPluginErrors(Long countAuthPluginErrors) {
        this.countAuthPluginErrors = countAuthPluginErrors;
    }

    public Long getCountHandshakeErrors() {
        return countHandshakeErrors;
    }

    public void setCountHandshakeErrors(Long countHandshakeErrors) {
        this.countHandshakeErrors = countHandshakeErrors;
    }

    public Long getCountProxyUserErrors() {
        return countProxyUserErrors;
    }

    public void setCountProxyUserErrors(Long countProxyUserErrors) {
        this.countProxyUserErrors = countProxyUserErrors;
    }

    public Long getCountProxyUserAclErrors() {
        return countProxyUserAclErrors;
    }

    public void setCountProxyUserAclErrors(Long countProxyUserAclErrors) {
        this.countProxyUserAclErrors = countProxyUserAclErrors;
    }

    public Long getCountAuthenticationErrors() {
        return countAuthenticationErrors;
    }

    public void setCountAuthenticationErrors(Long countAuthenticationErrors) {
        this.countAuthenticationErrors = countAuthenticationErrors;
    }

    public Long getCountSslErrors() {
        return countSslErrors;
    }

    public void setCountSslErrors(Long countSslErrors) {
        this.countSslErrors = countSslErrors;
    }

    public Long getCountMaxUserConnectionsErrors() {
        return countMaxUserConnectionsErrors;
    }

    public void setCountMaxUserConnectionsErrors(Long countMaxUserConnectionsErrors) {
        this.countMaxUserConnectionsErrors = countMaxUserConnectionsErrors;
    }

    public Long getCountMaxUserConnectionsPerHourErrors() {
        return countMaxUserConnectionsPerHourErrors;
    }

    public void setCountMaxUserConnectionsPerHourErrors(Long countMaxUserConnectionsPerHourErrors) {
        this.countMaxUserConnectionsPerHourErrors = countMaxUserConnectionsPerHourErrors;
    }

    public Long getCountDefaultDatabaseErrors() {
        return countDefaultDatabaseErrors;
    }

    public void setCountDefaultDatabaseErrors(Long countDefaultDatabaseErrors) {
        this.countDefaultDatabaseErrors = countDefaultDatabaseErrors;
    }

    public Long getCountInitConnectErrors() {
        return countInitConnectErrors;
    }

    public void setCountInitConnectErrors(Long countInitConnectErrors) {
        this.countInitConnectErrors = countInitConnectErrors;
    }

    public Long getCountLocalErrors() {
        return countLocalErrors;
    }

    public void setCountLocalErrors(Long countLocalErrors) {
        this.countLocalErrors = countLocalErrors;
    }

    public Long getCountUnknownErrors() {
        return countUnknownErrors;
    }

    public void setCountUnknownErrors(Long countUnknownErrors) {
        this.countUnknownErrors = countUnknownErrors;
    }

    public Date getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Date getFirstErrorSeen() {
        return firstErrorSeen;
    }

    public void setFirstErrorSeen(Date firstErrorSeen) {
        this.firstErrorSeen = firstErrorSeen;
    }

    public Date getLastErrorSeen() {
        return lastErrorSeen;
    }

    public void setLastErrorSeen(Date lastErrorSeen) {
        this.lastErrorSeen = lastErrorSeen;
    }
}