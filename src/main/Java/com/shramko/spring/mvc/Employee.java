package com.shramko.spring.mvc;

import com.shramko.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name should be min 2 symbols")
    private String name;
    @NotEmpty(message = "Surname is required")
    @NotBlank(message = "Surname must not be blank")
    private String surname;
    @Min(value = 500, message = "Salary must be greater than 500")
    @Max(value = 5000, message = "Salary must be less than 5000")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private String carBrand;
    private String[] languages;
    private Map<String, String> languageList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("Sales", "Sales");
        departments.put("HR", "Human Resources");

        carBrands = new HashMap<>();
        carBrands.put("Mercedes-Benz", "Mercedes");
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");

        languageList = new HashMap<>();
        languageList.put("English", "En");
        languageList.put("Deutch", "De");
        languageList.put("French", "Fr");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
