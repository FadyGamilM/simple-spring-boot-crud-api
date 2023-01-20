package com.customerapi.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private final ICustomerRepo _customerRepo;

    @Autowired
    public CustomerService(ICustomerRepo customerRepo){
        _customerRepo = customerRepo;
    }

    public List<Customer> GetCustomers(){
        return  _customerRepo.GetCustomers();
    }
}
