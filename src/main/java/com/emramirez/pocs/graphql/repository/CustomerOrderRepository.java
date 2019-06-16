package com.emramirez.pocs.graphql.repository;

import com.emramirez.pocs.graphql.domain.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long> {
}
