package com.sz.model;

public class XIoGlobalByFileByLatency {
    private String file;

    private Long total;

    private Long totalLatency;

    private Long countRead;

    private Long readLatency;

    private Long countWrite;

    private Long writeLatency;

    private Long countMisc;

    private Long miscLatency;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    public Long getCountRead() {
        return countRead;
    }

    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    public Long getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(Long readLatency) {
        this.readLatency = readLatency;
    }

    public Long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    public Long getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(Long writeLatency) {
        this.writeLatency = writeLatency;
    }

    public Long getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(Long countMisc) {
        this.countMisc = countMisc;
    }

    public Long getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(Long miscLatency) {
        this.miscLatency = miscLatency;
    }
}