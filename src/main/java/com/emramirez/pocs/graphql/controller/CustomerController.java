package com.emramirez.pocs.graphql.controller;

import com.emramirez.pocs.graphql.domain.Customer;
import com.emramirez.pocs.graphql.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
