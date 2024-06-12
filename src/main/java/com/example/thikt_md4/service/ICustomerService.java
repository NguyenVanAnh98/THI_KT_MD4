package com.example.thikt_md4.service;

import com.example.thikt_md4.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long Id);

    void saveCustomer(Customer customer);

    void deleteCustomer(Long Id);
}
