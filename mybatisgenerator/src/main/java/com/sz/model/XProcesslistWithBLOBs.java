package com.sz.model;

public class XProcesslistWithBLOBs extends XProcesslist {
    private String currentStatement;

    private String lastStatement;

    public String getCurrentStatement() {
        return currentStatement;
    }

    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement == null ? null : currentStatement.trim();
    }

    public String getLastStatement() {
        return lastStatement;
    }

    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement == null ? null : lastStatement.trim();
    }
}