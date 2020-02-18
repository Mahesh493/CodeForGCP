package com.inventory.ProductManagementSystem.Controller;

import com.inventory.ProductManagementSystem.Entity.Product;
import com.inventory.ProductManagementSystem.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/inventory")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/welcome")
    public String greetWelcome(){
        return "Welcome to Product Management System";
    }

    @GetMapping("/product/{productId}")
    public Product getProductById(@PathVariable int productId)
    {
        return productService.searchProductById(productId);
    }

    @GetMapping("/product")
    public ArrayList<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @PostMapping("/product")
    public void createProduct(@RequestBody Product product)
    {
        productService.createProduct(product);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product updatedProduct)
    {
        productService.updateProduct(updatedProduct);
    }

}
