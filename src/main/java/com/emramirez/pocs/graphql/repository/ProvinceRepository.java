package com.emramirez.pocs.graphql.repository;

import com.emramirez.pocs.graphql.domain.Province;
import org.springframework.data.repository.CrudRepository;

public interface ProvinceRepository extends CrudRepository<Province, Long> {
}
