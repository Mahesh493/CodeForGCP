package com.inventory.ProductManagementSystem.Repository;

import com.inventory.ProductManagementSystem.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {





}
