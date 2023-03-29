package com.example.springhomework3.service;

import com.example.springhomework3.entity.Subscription;
import com.example.springhomework3.repository.SubscriptionCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {

    @Autowired
    SubscriptionCrudRepository subscriptionCrudRepository;

    //JPA
    public List<Subscription> findByCostGreaterThan(String cost){
        return subscriptionCrudRepository.findByCostGreaterThan(cost);
    }

    public List<Subscription> findByArea(String area){
        return subscriptionCrudRepository.findByArea(area);
    }

    public Iterable<Subscription> findAll(){
        return subscriptionCrudRepository.findAll();
    }

    //HQL
    public Subscription findById(int id){
        return subscriptionCrudRepository.findById(id);
    }

    public List<Subscription> filterBySpeed(int speed){
        return subscriptionCrudRepository.filterBySpeed(speed);
    }

    //Native
    public void updateDetailsById(int id, String details){
        subscriptionCrudRepository.updateDetailsById(id, details);
    }

}
