package dev.lukmann.application;

import dev.lukmann.data.Company;

public class InnerClassApp {
    public static void main(String[] args) {
        // Inner & Outer class

        Company company = new Company();
        company.setName("Multiintegra PT");

        Company.Employee employee = company.new Employee();
        employee.setName("Lukman");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("BMW");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("John Doe");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
