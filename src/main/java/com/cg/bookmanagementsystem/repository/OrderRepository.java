package com.cg.bookmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookmanagementsystem.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String>{
}
