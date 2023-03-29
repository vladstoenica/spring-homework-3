package com.example.springhomework3.controller;

import com.example.springhomework3.entity.Bill;
import com.example.springhomework3.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/billNo/{billNo}")     //find by id
    public Bill findByBillNo(@PathVariable int billNo){
        return billService.findByBillNo(billNo);
    }

    @GetMapping     //list all
    public Iterable<Bill> findAll(){
        return billService.findAll();
    }

    @PostMapping    //insert
    public Bill saveBill(@RequestBody Bill bill) {
        return billService.save(bill);
    }

    @GetMapping("/byCustomer/{customerId}")     //gaseste bills dupa id-ul customerului
    public List<Bill> findBillsByCustomerId(@PathVariable int customerId){
        return billService.findBillsByCustomerId(customerId);
    }

    @GetMapping("/byStatus/{month}")    //filtreaza pe not paid
    public List<Bill> findUnpaidByMonth(@PathVariable String month){
        return billService.findUnpaidByMonth(month);
    }

    @GetMapping("/filtered")    //bills cu pret mai mare decat param dat
    public List<Bill> findFilteredByPrice(@RequestParam("price") String price) {
        return billService.findFilteredByPrice(price);
    }
}
