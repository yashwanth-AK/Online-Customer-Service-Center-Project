package com.onlineCustomerServiceCenter.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("customer")
    public Customer registerCustomer(@RequestBody Customer newCustomer){
        return this.customerService.registerCustomer(newCustomer);
    }
    @PutMapping("update/customer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return this.customerService.updateCustomer(customer);
    }
    @GetMapping("customers")
    public List<Customer> getAllCustomers() {
        return this.customerService.getAllCustomers();
    }
    @GetMapping("customer/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        return this.customerService.getCustomerById(id);
    }
    //GetMapping("Customer/name/{name}")
    //  public Customer getCustomerByName(@PathVariable String name){
    //    return this.customerService.getCustomerByName(name);
    //}
    @DeleteMapping("customer/{id}")
    public Customer deleteCustomerById(@PathVariable Integer id) {
        return this.customerService.deleteCustomerById(id);
    }

}
