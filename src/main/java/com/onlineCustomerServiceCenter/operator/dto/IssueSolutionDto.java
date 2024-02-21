package com.onlineCustomerServiceCenter.operator.dto;

public class IssueSolutionDto {
    private String issueId;
    private String solutionDescription;

    public IssueSolutionDto() {
    }

    public IssueSolutionDto(String issueId, String solutionDescription) {
        this.issueId = issueId;
        this.solutionDescription = solutionDescription;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getSolutionDescription() {
        return solutionDescription;
    }

    public void setSolutionDescription(String solutionDescription) {
        this.solutionDescription = solutionDescription;
    }
}
