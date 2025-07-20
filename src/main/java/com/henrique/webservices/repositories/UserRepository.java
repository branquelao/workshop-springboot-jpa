package com.henrique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
