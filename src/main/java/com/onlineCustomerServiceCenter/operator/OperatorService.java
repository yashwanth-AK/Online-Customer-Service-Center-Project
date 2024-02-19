package com.onlineCustomerServiceCenter.operator;

import com.onlineCustomerServiceCenter.customer.Customer;
import com.onlineCustomerServiceCenter.issue.Issue;

public interface OperatorService {

    Operator updateOperatorProfile(Operator updatedoperator);

    String loginOperator(String email, String password);

    Issue addIssueSolution(String issueId, String solutionDescription);
}
