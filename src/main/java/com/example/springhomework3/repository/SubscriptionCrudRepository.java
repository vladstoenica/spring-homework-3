package com.example.springhomework3.repository;

import com.example.springhomework3.entity.Customer;
import com.example.springhomework3.entity.Subscription;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.beans.Transient;
import java.util.List;

public interface SubscriptionCrudRepository extends CrudRepository<Subscription, Integer> {

    //JPA
    List<Subscription> findByCostGreaterThan(String cost);
    List<Subscription> findByArea(String area);
    Iterable<Subscription> findAll();

    //HQL
    @Query("SELECT s FROM Subscription s WHERE s.subscriptionId = :id")
    Subscription findById(@Param("id") int id);

    @Query("SELECT s FROM Subscription s WHERE s.speed > :speed")
    List<Subscription> filterBySpeed(@Param("speed") int speed);

    //Native
    @Transactional
    @Modifying
    @Query(value = "UPDATE subscription SET details = :details WHERE subscription_id = :id", nativeQuery = true)
    void updateDetailsById(@Param("id") int id, @Param("details") String details);


}
