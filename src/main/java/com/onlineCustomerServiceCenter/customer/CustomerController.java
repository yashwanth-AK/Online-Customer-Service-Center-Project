package com.onlineCustomerServiceCenter.customer;

import com.onlineCustomerServiceCenter.issue.Issue;
import com.onlineCustomerServiceCenter.issue.IssueService;
import com.onlineCustomerServiceCenter.issue.IssueServiceImpl;
import com.onlineCustomerServiceCenter.issue.exception.IssueNotFoundException;
import com.onlineCustomerServiceCenter.issue.exception.NullIssueException;
import com.onlineCustomerServiceCenter.solution.Solution;
import com.onlineCustomerServiceCenter.solution.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private IssueService issueService;
    @Autowired
    private SolutionService solutionService;


    @PostMapping("customer")
    public Customer registerCustomer(@RequestBody Customer newCustomer) throws CustomerRegisterException {
        return this.customerService.registerCustomer(newCustomer);
    }

    @PostMapping("login/customer")
    public Customer userAccountLogin(@RequestBody CustomerLoginDto loginDto) throws CustomerLoginException {
        return this.customerService.customerLogin(loginDto.getUserEmail(), loginDto.getCustomerPassword());
    }

    @PutMapping("update/customer")
    public Customer updateCustomerProfile(@RequestBody Customer customer) throws CustomerUpdateException {
        return this.customerService.updateCustomer(customer);
    }

    @GetMapping("customers")
    public List<Customer> getAllCustomers() {
        return this.customerService.getAllCustomers();
    }

    @GetMapping("customer/{id}")
    public Customer getCustomerById(@PathVariable("id") Integer id) {
        return this.customerService.getCustomerById(id);
    }

    @DeleteMapping("customer/{id}")
    public Customer deleteCustomerById(@PathVariable("id") Integer id) throws CustomerDeleteException {
        return this.customerService.deleteCustomerById(id);
    }
//   @PatchMapping("customer")
 //public Customer acceptSolution() {
    //return this.solutionService.acceptSolution();

   //}

    @PostMapping("issue/create")
    public Issue createIssue(@RequestBody Issue newIssue) throws NullIssueException {
        return this.issueService.addIssue(newIssue);
    }

    @PutMapping("issue/update")
    public Issue updateIssue(@RequestBody Issue issue, @PathVariable String newDesc) throws NullIssueException {
        return this.issueService.updateIssueDescById(issue, newDesc);
    }

    @DeleteMapping("issue/{id}")
    public Issue deleteIssue(@PathVariable Integer id) throws IssueNotFoundException {
        return this.issueService.deleteIssueById(id);
    }

}

