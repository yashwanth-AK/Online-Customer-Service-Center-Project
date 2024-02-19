package com.onlineCustomerServiceCenter.customer;

import java.util.List;

public interface CustomerService {
    Customer registerCustomer(Customer newCustomer);
    Customer updateCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Integer customerId);
    // Customer getCustomerByName(String customerName);
    Customer deleteCustomerById(Integer customerId);
}
