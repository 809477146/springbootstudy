package com.sz.model;

public class XLatestFileIo {
    private String thread;

    private String file;

    private Long latency;

    private String operation;

    private Long requested;

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread == null ? null : thread.trim();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Long getLatency() {
        return latency;
    }

    public void setLatency(Long latency) {
        this.latency = latency;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public Long getRequested() {
        return requested;
    }

    public void setRequested(Long requested) {
        this.requested = requested;
    }
}