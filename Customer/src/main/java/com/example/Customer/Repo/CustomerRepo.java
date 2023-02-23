package com.example.Customer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer.Entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity,Integer> {

}
