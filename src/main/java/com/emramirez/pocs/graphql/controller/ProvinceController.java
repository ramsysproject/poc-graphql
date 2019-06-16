package com.emramirez.pocs.graphql.controller;

import com.emramirez.pocs.graphql.domain.Province;
import com.emramirez.pocs.graphql.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provinces")
public class ProvinceController {

    ProvinceRepository provinceRepository;

    @Autowired
    public ProvinceController(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Province> getProvinces() {
        return provinceRepository.findAll();
    }
}
