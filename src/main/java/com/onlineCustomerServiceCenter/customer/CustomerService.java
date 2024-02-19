package com.onlineCustomerServiceCenter.customer;

import java.util.List;

public interface CustomerService {
    Customer registerCustomer(Customer newCustomer) throws CustomerExceptions;
    Customer customerLogin(String customerEmail,String customerPassword) throws CustomerExceptions;
    Customer updateCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Integer customerId);
    // Customer getCustomerByName(String customerName);
    Customer deleteCustomerById(Integer customerId) throws CustomerExceptions ;

}
