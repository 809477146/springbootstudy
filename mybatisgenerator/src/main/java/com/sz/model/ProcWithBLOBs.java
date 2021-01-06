package com.sz.model;

public class ProcWithBLOBs extends Proc {
    private byte[] paramList;

    private byte[] returns;

    private byte[] body;

    private String comment;

    private byte[] bodyUtf8;

    public byte[] getParamList() {
        return paramList;
    }

    public void setParamList(byte[] paramList) {
        this.paramList = paramList;
    }

    public byte[] getReturns() {
        return returns;
    }

    public void setReturns(byte[] returns) {
        this.returns = returns;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public byte[] getBodyUtf8() {
        return bodyUtf8;
    }

    public void setBodyUtf8(byte[] bodyUtf8) {
        this.bodyUtf8 = bodyUtf8;
    }
}