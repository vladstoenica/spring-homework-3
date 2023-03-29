package com.example.springhomework3.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
//    @GeneratedValue  am scos pt ca nu mergea la save()
    int customerId;
    @Column(unique = true, name = "phoneNumber")
    String phoneNumber;
    @Column(name = "customerName")
    String customerName;
    @Column(name = "customerAddress")
    String customerAddress;
    @Column(name = "customerType")
    String customerType;
    @Column(name = "customerIdProof")
    int idProof;   //0 nu are, 1 are
    @ManyToOne
    @JoinColumn(name = "subscription_id")
    Subscription subscription;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)   //daca stergem un customer, stergem si bills-urile lui
    List<Bill> bills;


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerType='" + customerType + '\'' +
                ", idProof=" + idProof +
                '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public int getIdProof() {
        return idProof;
    }

    public void setIdProof(int idProof) {
        this.idProof = idProof;
    }
}
