package com.Payment.OMS.Registry;


import com.Payment.OMS.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
