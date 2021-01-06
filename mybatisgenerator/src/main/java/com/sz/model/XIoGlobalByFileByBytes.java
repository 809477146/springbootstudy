package com.sz.model;

import java.math.BigDecimal;

public class XIoGlobalByFileByBytes {
    private String file;

    private Long countRead;

    private Long totalRead;

    private BigDecimal avgRead;

    private Long countWrite;

    private Long totalWritten;

    private BigDecimal avgWrite;

    private Long total;

    private BigDecimal writePct;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Long getCountRead() {
        return countRead;
    }

    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    public Long getTotalRead() {
        return totalRead;
    }

    public void setTotalRead(Long totalRead) {
        this.totalRead = totalRead;
    }

    public BigDecimal getAvgRead() {
        return avgRead;
    }

    public void setAvgRead(BigDecimal avgRead) {
        this.avgRead = avgRead;
    }

    public Long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    public Long getTotalWritten() {
        return totalWritten;
    }

    public void setTotalWritten(Long totalWritten) {
        this.totalWritten = totalWritten;
    }

    public BigDecimal getAvgWrite() {
        return avgWrite;
    }

    public void setAvgWrite(BigDecimal avgWrite) {
        this.avgWrite = avgWrite;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public BigDecimal getWritePct() {
        return writePct;
    }

    public void setWritePct(BigDecimal writePct) {
        this.writePct = writePct;
    }
}