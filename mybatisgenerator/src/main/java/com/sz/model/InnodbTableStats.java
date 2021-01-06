package com.sz.model;

import java.util.Date;

public class InnodbTableStats extends InnodbTableStatsKey {
    private Date lastUpdate;

    private Long nRows;

    private Long clusteredIndexSize;

    private Long sumOfOtherIndexSizes;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getnRows() {
        return nRows;
    }

    public void setnRows(Long nRows) {
        this.nRows = nRows;
    }

    public Long getClusteredIndexSize() {
        return clusteredIndexSize;
    }

    public void setClusteredIndexSize(Long clusteredIndexSize) {
        this.clusteredIndexSize = clusteredIndexSize;
    }

    public Long getSumOfOtherIndexSizes() {
        return sumOfOtherIndexSizes;
    }

    public void setSumOfOtherIndexSizes(Long sumOfOtherIndexSizes) {
        this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
    }
}