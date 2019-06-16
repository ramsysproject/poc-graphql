package com.emramirez.pocs.graphql.configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.emramirez.pocs.graphql.domain"})
public class DataConfiguration {
}
