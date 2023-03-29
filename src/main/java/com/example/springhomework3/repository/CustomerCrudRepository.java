package com.example.springhomework3.repository;

import com.example.springhomework3.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerCrudRepository extends CrudRepository<Customer, Integer> {  //*integer pt ca primary key e id

    //JPA
    Customer findById(int id);
    Iterable<Customer> findAll();
    Customer save(Customer customer);
    void deleteByCustomerId(int id);

    //HQL Queries
    @Query("SELECT c FROM Customer c WHERE c.customerType = :type")
    List<Customer> findByCustomerType(String type);

    @Query("SELECT CASE WHEN c.idProof = 1 THEN 'present' ELSE 'not present' END FROM Customer c WHERE c.customerId = :customerId")
    String checkForCustomerIdProof(int customerId);

    //Natural Query
    @Query(value = "SELECT * FROM customers WHERE customer_name LIKE 'i%'", nativeQuery = true)
    List<Customer> findCustomersNameWithI();


}
