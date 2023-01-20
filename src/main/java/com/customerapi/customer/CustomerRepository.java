package com.customerapi.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Primary // my priamry implementation of the repository layer
public class CustomerRepository implements ICustomerRepo {
    @Override
    public List<Customer> GetCustomers() {
        // TODO => connect to the database and fetch users
        return Collections.emptyList();
    }
}
