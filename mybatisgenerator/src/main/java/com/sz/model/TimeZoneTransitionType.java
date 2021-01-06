package com.sz.model;

public class TimeZoneTransitionType extends TimeZoneTransitionTypeKey {
    private Integer offset;

    private Byte isDst;

    private String abbreviation;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Byte getIsDst() {
        return isDst;
    }

    public void setIsDst(Byte isDst) {
        this.isDst = isDst;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }
}