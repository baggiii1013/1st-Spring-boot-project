package com.kaustubh.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaustubh.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product,Integer> {

}
