package com.example.springhomework3.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Bill {
    @Id
//    @GeneratedValue  //nu puteam sa fac insert cu el
    int billNo;
    @Column(name = "month")
    String month;
    @Column(name = "cost")
    String cost;
    @Column(name = "status")
    String status;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "subscription_id")
    Subscription subscription;


    @Override
    public String toString() {
        return "Bill{" +
                "billNo=" + billNo +
                ", month='" + month + '\'' +
                ", cost='" + cost + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
