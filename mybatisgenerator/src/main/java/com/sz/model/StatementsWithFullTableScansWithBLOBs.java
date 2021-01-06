package com.sz.model;

public class StatementsWithFullTableScansWithBLOBs extends StatementsWithFullTableScans {
    private String query;

    private String totalLatency;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }
}