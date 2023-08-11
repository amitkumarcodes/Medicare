package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    // Additional queries or methods as needed
}

