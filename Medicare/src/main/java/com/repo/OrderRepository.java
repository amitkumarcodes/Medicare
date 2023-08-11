package com.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
   
}

