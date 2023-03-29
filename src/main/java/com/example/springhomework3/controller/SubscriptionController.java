package com.example.springhomework3.controller;

import com.example.springhomework3.entity.Subscription;
import com.example.springhomework3.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @Autowired
    SubscriptionService subscriptionService;

    //JPA
    @GetMapping("/cost/{cost}")     //lista subs cu pret mai mare decat cel dat in url
    public List<Subscription> findByCostGreaterThan(@PathVariable String cost){
        return subscriptionService.findByCostGreaterThan(cost);
    }

    @GetMapping("area/{area}")      //find by area
    public List<Subscription> findByArea(@PathVariable String area){
        return subscriptionService.findByArea(area);
    }

    @GetMapping     //get All
    public Iterable<Subscription> findAll(){
        return subscriptionService.findAll();
    }

    //HQL
    @GetMapping("/id/{id}")     //find by id
    public Subscription findById(@PathVariable int id){
        return subscriptionService.findById(id);
    }

    @GetMapping("/speed/{speed}")      //filter ca speed sa fie mai mare ca ce e in url
    public List<Subscription> filterBySpeed(@PathVariable int speed){
        return subscriptionService.filterBySpeed(speed);
    }

    //Natural
    @PutMapping("/id/{id}")     //update by id
    public void updateCostById(@PathVariable int id, @RequestBody Subscription subscription) {
        String details = subscription.getDetails();
        subscriptionService.updateDetailsById(id, details);
    }

}
