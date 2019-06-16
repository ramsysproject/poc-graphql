package com.emramirez.pocs.graphql.provider;

import com.emramirez.pocs.graphql.domain.Customer;
import com.emramirez.pocs.graphql.repository.CustomerRepository;
import com.emramirez.pocs.graphql.repository.ProvinceRepository;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

@Component
public class GraphQLDataFetchers {

    private CustomerRepository customerRepository;
    private ProvinceRepository provinceRepository;

    public GraphQLDataFetchers(CustomerRepository customerRepository, ProvinceRepository provinceRepository) {
        this.customerRepository = customerRepository;
        this.provinceRepository = provinceRepository;
    }

    public DataFetcher getCustomerByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            Long customerId = dataFetchingEnvironment.getArgument("id");
            return customerRepository.findById(customerId).orElse(null);
        };
    }

    public DataFetcher getProvinceDataFetcher() {
        return dataFetchingEnvironment -> {
            Customer customer = dataFetchingEnvironment.getSource();
            Long provinceId = customer.getProvinceId();
            return provinceRepository.findById(provinceId).orElse(null);
        };
    }
}
