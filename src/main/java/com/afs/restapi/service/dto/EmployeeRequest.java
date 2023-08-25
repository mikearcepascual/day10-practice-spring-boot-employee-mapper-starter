package com.afs.restapi.service.dto;

public class EmployeeRequest {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Long companyId;

    public EmployeeRequest() {
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
}
