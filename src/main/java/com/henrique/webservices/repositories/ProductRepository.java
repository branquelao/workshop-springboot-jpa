package com.henrique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
