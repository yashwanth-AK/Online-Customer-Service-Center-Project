package com.onlineCustomerServiceCenter.operator;

import com.onlineCustomerServiceCenter.customer.Customer;
import com.onlineCustomerServiceCenter.issue.Issue;
import com.onlineCustomerServiceCenter.issue.exception.IssueNotFoundException;
import com.onlineCustomerServiceCenter.solution.SolutionException;

public interface OperatorService {

    Operator updateOperatorProfile(Operator updatedoperator);

    String loginOperator(String email, String password);

    Issue addIssueSolution(Integer issueId, String solutionDescription) throws SolutionException, IssueNotFoundException;
}
