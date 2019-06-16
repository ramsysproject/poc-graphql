package com.emramirez.pocs.graphql.controller;

import com.emramirez.pocs.graphql.domain.CustomerOrder;
import com.emramirez.pocs.graphql.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-orders")
public class CustomerOrderController {

    private CustomerOrderRepository customerOrderRepository;

    @Autowired
    public CustomerOrderController(CustomerOrderRepository customerOrderRepository) {
        this.customerOrderRepository = customerOrderRepository;
    }

    @GetMapping
    public Iterable<CustomerOrder> getCustomerOrders() {
        return customerOrderRepository.findAll();
    }
}
