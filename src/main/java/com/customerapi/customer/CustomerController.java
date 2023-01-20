package com.customerapi.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CustomerController {

    private final CustomerService _customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        _customerService=customerService;
    }

    @GetMapping("/customers")
    public List<Customer> GetCustomers(){
        return _customerService.GetCustomers();
    }
}
