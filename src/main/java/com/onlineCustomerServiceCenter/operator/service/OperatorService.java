package com.onlineCustomerServiceCenter.operator.service;

import com.onlineCustomerServiceCenter.issue.Issue;
import com.onlineCustomerServiceCenter.operator.entity.Operator;

public interface OperatorService {

    Operator updateOperatorProfile(Operator updatedoperator);

    String loginOperator(String email, String password);

    Issue addIssueSolution(String issueId, String solutionDescription);
}
