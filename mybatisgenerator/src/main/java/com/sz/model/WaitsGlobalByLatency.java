package com.sz.model;

public class WaitsGlobalByLatency {
    private String events;

    private Long total;

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events == null ? null : events.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}