package com.example.springhomework3.repository;

import com.example.springhomework3.entity.Bill;
import com.example.springhomework3.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BillCrudRepository extends CrudRepository<Bill, Integer> {

    //JPA
    Bill findByBillNo(int billNo);
    Iterable<Bill> findAll();
    Bill save(Bill bill);

    //HQL
    @Query("SELECT b FROM Bill b WHERE b.customer.customerId = :customerId")
    List<Bill> findBillsByCustomerId(int customerId);

    @Query("SELECT b FROM Bill b WHERE b.month = :month AND b.status = 'not paid'")
    List<Bill> findUnpaidByMonth(String month);

    //Natural
    @Query(value = "SELECT * FROM bill WHERE cost > :price", nativeQuery = true)
    List<Bill> findFilteredByPrice(@Param("price") String price);

}
