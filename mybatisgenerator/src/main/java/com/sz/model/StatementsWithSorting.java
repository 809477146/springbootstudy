package com.sz.model;

import java.math.BigDecimal;
import java.util.Date;

public class StatementsWithSorting {
    private String db;

    private Long execCount;

    private Long sortMergePasses;

    private BigDecimal avgSortMerges;

    private Long sortsUsingScans;

    private Long sortUsingRange;

    private Long rowsSorted;

    private BigDecimal avgRowsSorted;

    private Date firstSeen;

    private Date lastSeen;

    private String digest;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    public Long getExecCount() {
        return execCount;
    }

    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    public void setSortMergePasses(Long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    public BigDecimal getAvgSortMerges() {
        return avgSortMerges;
    }

    public void setAvgSortMerges(BigDecimal avgSortMerges) {
        this.avgSortMerges = avgSortMerges;
    }

    public Long getSortsUsingScans() {
        return sortsUsingScans;
    }

    public void setSortsUsingScans(Long sortsUsingScans) {
        this.sortsUsingScans = sortsUsingScans;
    }

    public Long getSortUsingRange() {
        return sortUsingRange;
    }

    public void setSortUsingRange(Long sortUsingRange) {
        this.sortUsingRange = sortUsingRange;
    }

    public Long getRowsSorted() {
        return rowsSorted;
    }

    public void setRowsSorted(Long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    public BigDecimal getAvgRowsSorted() {
        return avgRowsSorted;
    }

    public void setAvgRowsSorted(BigDecimal avgRowsSorted) {
        this.avgRowsSorted = avgRowsSorted;
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

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }
}