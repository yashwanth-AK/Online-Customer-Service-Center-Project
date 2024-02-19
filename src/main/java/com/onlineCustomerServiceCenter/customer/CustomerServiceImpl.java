package com.onlineCustomerServiceCenter.customer;

import com.onlineCustomerServiceCenter.customer.CustomerRepository;
import com.onlineCustomerServiceCenter.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer registerCustomer(Customer newCustomer) {
        return this.customerRepository.save(newCustomer);
    }
}