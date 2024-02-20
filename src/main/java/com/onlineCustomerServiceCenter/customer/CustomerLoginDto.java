package com.onlineCustomerServiceCenter.customer;

public class CustomerLoginDto {
    private String customerEmail;
    private String customerPassword;

    public CustomerLoginDto() {
        super();
    }

    public CustomerLoginDto(String customerEmail, String customerPassword) {
        super();
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
    }

    public String getUserEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setUserPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
}




