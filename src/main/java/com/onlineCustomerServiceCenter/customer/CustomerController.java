package com.onlineCustomerServiceCenter.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("customer")
    public Customer registerCustomer(@RequestBody Customer newCustomer) throws CustomerRegisterException{
        return this.customerService.registerCustomer(newCustomer);
    }
    @PostMapping("login/customer")
	public Customer userAccountLogin(@RequestBody CustomerLoginDto loginDto) throws CustomerLoginException{
		return this.customerService.customerLogin(loginDto.getUserEmail(), loginDto.getCustomerPassword());
	}
    @PutMapping("update/customer")
    public Customer updateCustomerProfile(@RequestBody Customer customer) throws CustomerUpdateException{
        return this.customerService.updateCustomer(customer);
    }
    @GetMapping("customers")
    public List<Customer> getAllCustomers() {
        return this.customerService.getAllCustomers();
    }
    @GetMapping("customer/{id}")
    public Customer getCustomerById(@PathVariable("id") Integer id){
        return this.customerService.getCustomerById(id);
    }
    @DeleteMapping("customer/{id}")
    public Customer deleteCustomerById(@PathVariable("id") Integer id) throws CustomerDeleteException{
        return this.customerService.deleteCustomerById(id);
    }

}
