package com.afs.restapi.service.dto;

import com.afs.restapi.entity.Company;

public class CompanyRequest {
    private Long id;
    private String name;

    public CompanyRequest() {
    }

    public CompanyRequest(Company company) {
        this.name = company.getName();
    }

    public CompanyRequest(String name) {
        this.name = name;
    }

    public CompanyRequest(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
