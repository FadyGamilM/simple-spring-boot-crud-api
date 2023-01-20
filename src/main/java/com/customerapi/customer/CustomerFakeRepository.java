package com.customerapi.customer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "fakeRepo")
public class CustomerFakeRepository implements  ICustomerRepo{
    @Override
    public List<Customer> GetCustomers() {
        return List.of(
                new Customer(1, "fake user 1"),
                new Customer(2, "fake user 2")
        );
    }
}
