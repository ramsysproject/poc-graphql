package com.emramirez.pocs.graphql.repository;

import com.emramirez.pocs.graphql.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
