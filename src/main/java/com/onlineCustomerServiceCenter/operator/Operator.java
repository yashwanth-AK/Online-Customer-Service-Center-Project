package com.onlineCustomerServiceCenter.operator;

import com.onlineCustomerServiceCenter.customer.Issue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Operator {
    @Id
    @GeneratedValue()
    private Integer operatorId;

    @NotNull(message = "First Name cannot be null")
    @NotBlank(message = "First Name cannot be blank")

    private String firstName;

    private String lastName;
    private String email;
    private String password;
    private String departmentName;
    private String phoneNumber;
    private String city;
    @OneToMany
    private List<Issue> customerIssues=new ArrayList<>();

    public Operator(Integer operatorId, String firstName, String lastName, String email, String password, String phoneNumber, String city, List<Issue> customerIssues) {
        this.operatorId = operatorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.customerIssues = customerIssues;
    }

    public Operator() {
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Issue> getCustomerIssues() {
        return customerIssues;
    }

    public void setCustomerIssues(List<Issue> customerIssues) {
        this.customerIssues = customerIssues;
    }
}