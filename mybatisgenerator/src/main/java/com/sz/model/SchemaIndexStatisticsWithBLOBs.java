package com.sz.model;

public class SchemaIndexStatisticsWithBLOBs extends SchemaIndexStatistics {
    private String selectLatency;

    private String insertLatency;

    private String updateLatency;

    private String deleteLatency;

    public String getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(String selectLatency) {
        this.selectLatency = selectLatency == null ? null : selectLatency.trim();
    }

    public String getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency == null ? null : insertLatency.trim();
    }

    public String getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency == null ? null : updateLatency.trim();
    }

    public String getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency == null ? null : deleteLatency.trim();
    }
}