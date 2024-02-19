package com.onlineCustomerServiceCenter.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer registerCustomer(Customer newCustomer) {
        return this.customerRepository.save(newCustomer);
    }
    public Customer updateCustomer(Customer customer){
        return this.customerRepository.save(customer);
    }
    public List<Customer> getAllCustomers(){
        return this.customerRepository.findAll();
    }
    public Customer getCustomerById(Integer customerId){
        return this.customerRepository.findById(customerId).get();
    }
    // public Customer getCustomerByName(String customerName){
    //     return this.customerRepository.findByNameContaining(customerName);
    //}
    public Customer deleteCustomerById(Integer customerId)
    {
        Optional<Customer> accountOpt = this.customerRepository.findById(customerId);
        this.customerRepository.deleteById(customerId);
        return accountOpt.get();
    }

}