package com.example.springhomework3.service;

import com.example.springhomework3.entity.Bill;
import com.example.springhomework3.repository.BillCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    BillCrudRepository billCrudRepository;

    //JPA
    public Bill findByBillNo(int billNo){
        return billCrudRepository.findByBillNo(billNo);
    }

    public Iterable<Bill> findAll(){
        return billCrudRepository.findAll();
    }

    public Bill save(Bill bill){
        return billCrudRepository.save(bill);
    }

    //HQL
    public List<Bill> findBillsByCustomerId(int customerId){
        return billCrudRepository.findBillsByCustomerId(customerId);
    }

    public List<Bill> findUnpaidByMonth(String month){
        return billCrudRepository.findUnpaidByMonth(month);
    }

    //Natural
    public List<Bill> findFilteredByPrice(String price){
        return billCrudRepository.findFilteredByPrice(price);
    }


}
