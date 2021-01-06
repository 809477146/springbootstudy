package com.sz.model;

public class PartitionsWithBLOBs extends Partitions {
    private String partitionExpression;

    private String subpartitionExpression;

    private String partitionDescription;

    public String getPartitionExpression() {
        return partitionExpression;
    }

    public void setPartitionExpression(String partitionExpression) {
        this.partitionExpression = partitionExpression == null ? null : partitionExpression.trim();
    }

    public String getSubpartitionExpression() {
        return subpartitionExpression;
    }

    public void setSubpartitionExpression(String subpartitionExpression) {
        this.subpartitionExpression = subpartitionExpression == null ? null : subpartitionExpression.trim();
    }

    public String getPartitionDescription() {
        return partitionDescription;
    }

    public void setPartitionDescription(String partitionDescription) {
        this.partitionDescription = partitionDescription == null ? null : partitionDescription.trim();
    }
}