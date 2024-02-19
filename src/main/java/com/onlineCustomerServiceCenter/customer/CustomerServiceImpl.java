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
    public Customer registerCustomer(Customer newCustomer) throws CustomerExceptions{
        Optional<Customer> accountOpt = this.customerRepository.findByEmail(newCustomer.getEmail());
        if(accountOpt.isPresent())
            throw new CustomerExceptions("Email already registered, please re try."+newCustomer.getEmail());
        return this.customerRepository.save(newCustomer);
    }
    public Customer customerLogin(String customerEmail,String customerPassword) throws CustomerExceptions{
        Optional<Customer> customerOpt = this.customerRepository.findByEmail(customerEmail);
        if(customerOpt.isEmpty())
         throw new CustomerExceptions("Customer does not exists for :"+customerEmail);

        Customer foundCustomer = customerOpt.get();
       if(!foundCustomer.getPassword().equals(customerPassword))
            throw new CustomerExceptions("Password does not match");

        return foundCustomer;
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
    public Customer deleteCustomerById(Integer customerId) throws CustomerExceptions{
        Optional<Customer> customerOpt = this.customerRepository.findById(customerId);
        if(customerOpt.isEmpty())
            throw new CustomerExceptions("Customer does not exists for :"+ customerId);
        this.customerRepository.deleteById(customerId);
        return customerOpt.get();
    }

}
