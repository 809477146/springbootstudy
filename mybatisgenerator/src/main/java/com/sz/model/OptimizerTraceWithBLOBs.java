package com.sz.model;

public class OptimizerTraceWithBLOBs extends OptimizerTrace {
    private String query;

    private String trace;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace == null ? null : trace.trim();
    }
}