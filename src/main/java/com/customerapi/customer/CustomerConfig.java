package com.customerapi.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    // take this value from configuration of the porject
    @Value("${app.SelectFakeCustomerRepository:false}")
    private boolean SelectFakeCustomerRepository = false;

    @Bean
    ICustomerRepo customerRepo(){
        System.out.println("the value of SelectFakeCustomerRepository is : " + SelectFakeCustomerRepository);
        return SelectFakeCustomerRepository ?
                new CustomerFakeRepository() :
                new CustomerRepository();
    }

    @Bean // so this annotation will instantiate and execute the following code for us once the app is started
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Hello From The Customer Config - Command Line Runner method");
        };
    }
}
