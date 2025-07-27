package com.henrique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.webservices.entities.OrderItem;
import com.henrique.webservices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
