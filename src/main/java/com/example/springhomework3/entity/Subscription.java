package com.example.springhomework3.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @GeneratedValue
    int subscriptionId;
    @Column(name = "cost")
    String cost;
    @Column(name = "details")
    String details;
    @Column(name = "area")
    String area;
    @Column(name = "speed")
    int speed;
    @OneToMany(mappedBy = "subscription", cascade = CascadeType.ALL)
    List<Bill> bills;

    @Override
    public String toString() {
        return "Subscription{" +
                "subscriptionId=" + subscriptionId +
                ", cost='" + cost + '\'' +
                ", details='" + details + '\'' +
                ", area='" + area + '\'' +
                ", speed=" + speed +
                '}';
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
