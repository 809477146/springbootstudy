package com.sz.model;

public class EventsStagesCurrent {
    private Long threadId;

    private Long eventId;

    private Long endEventId;

    private String eventName;

    private String source;

    private Long timerStart;

    private Long timerEnd;

    private Long timerWait;

    private Long workCompleted;

    private Long workEstimated;

    private Long nestingEventId;

    private String nestingEventType;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getEndEventId() {
        return endEventId;
    }

    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Long getTimerStart() {
        return timerStart;
    }

    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    public Long getTimerEnd() {
        return timerEnd;
    }

    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    public Long getTimerWait() {
        return timerWait;
    }

    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    public Long getWorkCompleted() {
        return workCompleted;
    }

    public void setWorkCompleted(Long workCompleted) {
        this.workCompleted = workCompleted;
    }

    public Long getWorkEstimated() {
        return workEstimated;
    }

    public void setWorkEstimated(Long workEstimated) {
        this.workEstimated = workEstimated;
    }

    public Long getNestingEventId() {
        return nestingEventId;
    }

    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    public String getNestingEventType() {
        return nestingEventType;
    }

    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType == null ? null : nestingEventType.trim();
    }
}