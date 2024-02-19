package com.onlineCustomerServiceCenter.operator;

import com.onlineCustomerServiceCenter.customer.Customer;

public interface OperatorService {

    Operator updateOperatorProfile(Operator updatedoperator);

    String loginOperator(String email, String password);
}
