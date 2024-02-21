package com.onlineCustomerServiceCenter.customer;

import com.onlineCustomerServiceCenter.issue.Issue;

import java.util.List;

public interface CustomerService {
    Customer registerCustomer(Customer newCustomer) throws CustomerRegisterException;
    Customer customerLogin(String customerEmail,String customerPassword) throws CustomerLoginException;
    Customer updateCustomer(Customer customer) throws CustomerUpdateException;
    List<Customer> getAllCustomers();
    Customer getCustomerById(Integer customerId);
    // Customer getCustomerByName(String customerName);
    Customer deleteCustomerById(Integer customerId) throws CustomerDeleteException ;
   // Issue createIssue(Issue newIssue);
}
