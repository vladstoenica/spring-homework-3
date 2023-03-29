package com.example.springhomework3.controller;

import com.example.springhomework3.entity.Customer;
import com.example.springhomework3.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    //JPA
    @GetMapping("/id/{id}")     //find by id
    public Customer findById(@PathVariable(value = "id")int id){
        return customerService.findById(id);
    }

    @GetMapping     //list all
    public Iterable<Customer> findAllCustomers(){
        return customerService.findAll();
    }

    @PostMapping      //insert
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")     //delete
    public void deleteCustomerById(@PathVariable int id) {  //identic cu value
        customerService.deleteByCustomerId(id);
    }

    //HQL
    @GetMapping("/type/{type}")     //find by type (pers fizica sau PFA)
    public List<Customer> findByCustomerType(@PathVariable String type){
        return customerService.findByCustomerType(type);
    }

    @GetMapping("/{id}/idProof")       //returneaza prezent sau not present daca in BD e 1 sau 0
    public String checkForCustomerIdProof(@PathVariable int id) {
        return customerService.checkForCustomerIdProof(id);
    }

    @GetMapping("/filtered")     //lista customers cu nume care incepe cu i
    public List<Customer> findCustomersNameWithI(){
        return customerService.findCustomersNameWithI();
    }
}
