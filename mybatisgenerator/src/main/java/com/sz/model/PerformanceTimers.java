package com.sz.model;

public class PerformanceTimers {
    private String timerName;

    private Long timerFrequency;

    private Long timerResolution;

    private Long timerOverhead;

    public String getTimerName() {
        return timerName;
    }

    public void setTimerName(String timerName) {
        this.timerName = timerName == null ? null : timerName.trim();
    }

    public Long getTimerFrequency() {
        return timerFrequency;
    }

    public void setTimerFrequency(Long timerFrequency) {
        this.timerFrequency = timerFrequency;
    }

    public Long getTimerResolution() {
        return timerResolution;
    }

    public void setTimerResolution(Long timerResolution) {
        this.timerResolution = timerResolution;
    }

    public Long getTimerOverhead() {
        return timerOverhead;
    }

    public void setTimerOverhead(Long timerOverhead) {
        this.timerOverhead = timerOverhead;
    }
}