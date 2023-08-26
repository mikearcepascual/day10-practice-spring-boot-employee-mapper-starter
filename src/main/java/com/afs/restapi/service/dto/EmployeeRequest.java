package com.afs.restapi.service.dto;

import com.afs.restapi.entity.Employee;

public class EmployeeRequest {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Long companyId;

    public EmployeeRequest() {
    }

    public EmployeeRequest(Employee employee) {
        this.name = employee.getName();
        this.age = employee.getAge();
        this.gender = employee.getGender();
        this.salary = employee.getSalary();
        this.companyId = employee.getCompanyId();
    }

    public EmployeeRequest(Long id, String name, int age, String gender, int salary, Long companyId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.companyId = companyId;
    }

    public EmployeeRequest(String name, int age, String gender, int salary, Long companyId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
