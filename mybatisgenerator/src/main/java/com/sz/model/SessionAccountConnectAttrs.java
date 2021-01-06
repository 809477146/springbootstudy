package com.sz.model;

public class SessionAccountConnectAttrs {
    private Integer processlistId;

    private String attrName;

    private String attrValue;

    private Integer ordinalPosition;

    public Integer getProcesslistId() {
        return processlistId;
    }

    public void setProcesslistId(Integer processlistId) {
        this.processlistId = processlistId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }
}