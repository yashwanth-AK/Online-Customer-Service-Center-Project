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
    public Customer registerCustomer(Customer newCustomer) throws CustomerRegisterException{
        Optional<Customer> accountOpt = this.customerRepository.findByEmail(newCustomer.getEmail());
        if(accountOpt.isPresent())
            throw new CustomerRegisterException("Email already registered, please re try."+newCustomer.getEmail());
        return this.customerRepository.save(newCustomer);
    }
    public Customer customerLogin(String customerEmail,String customerPassword) throws CustomerLoginException{
        Optional<Customer> customerOpt = this.customerRepository.findByEmail(customerEmail);
        if(customerOpt.isEmpty())
         throw new CustomerLoginException("Customer does not exists for :"+customerEmail);

        Customer foundCustomer = customerOpt.get();
       if(!foundCustomer.getPassword().equals(customerPassword))
            throw new CustomerLoginException("Password does not match");

        return foundCustomer;
    }
    public Customer updateCustomer(Customer customer) throws CustomerUpdateException{
        Optional<Customer> customerOpt = this.customerRepository.findById(customer.getCustomerId());
        if(customerOpt.isEmpty())
            throw new CustomerUpdateException("Customer does not exists for :"+customer.getCustomerId());
        return this.customerRepository.save(customer);
    }
    public List<Customer> getAllCustomers(){
        return this.customerRepository.findAll();
    }
    public Customer getCustomerById(Integer customerId){
        return this.customerRepository.findById(customerId).get();
    }
    public Customer deleteCustomerById(Integer customerId) throws CustomerDeleteException{
        Optional<Customer> customerOpt = this.customerRepository.findById(customerId);
        if(customerOpt.isEmpty())
            throw new CustomerDeleteException("Customer does not exists for :"+ customerId);
        this.customerRepository.deleteById(customerId);
        return customerOpt.get();
    }

}
