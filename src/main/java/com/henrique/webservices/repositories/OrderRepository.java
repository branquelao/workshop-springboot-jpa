package com.henrique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
