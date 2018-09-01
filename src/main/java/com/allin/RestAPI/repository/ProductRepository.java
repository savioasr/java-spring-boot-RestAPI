package com.allin.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allin.RestAPI.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
