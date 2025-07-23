package com.henrique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
