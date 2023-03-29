package com.example.springhomework3.service;

import com.example.springhomework3.entity.Customer;
import com.example.springhomework3.repository.CustomerCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerCrudRepository customerCrudRepository;

    //JPA
    public Customer findById(int id){
        return customerCrudRepository.findById(id);
    }

    public Iterable<Customer> findAll(){
        return customerCrudRepository.findAll();
    }

    //insert
    public Customer save(Customer customer){
        return customerCrudRepository.save(customer);
    }

    public void deleteByCustomerId(int id){
        customerCrudRepository.deleteByCustomerId(id);
    }

    //HQL
    //ia toti customerii premium sau standard
    public List<Customer> findByCustomerType(String type){
        return customerCrudRepository.findByCustomerType(type);
    }

    public String checkForCustomerIdProof(int id){
        return customerCrudRepository.checkForCustomerIdProof(id);
    }

    public List<Customer> findCustomersNameWithI(){
        return customerCrudRepository.findCustomersNameWithI();
    }


}
