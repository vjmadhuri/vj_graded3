package com.jaya.project.service;

import com.jaya.project.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(Integer id);

    void save(Customer customer);

    void delete(Integer id);

}
