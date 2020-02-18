package com.inventory.ProductManagementSystem.Service;

import com.inventory.ProductManagementSystem.Entity.OrderProduct;
import com.inventory.ProductManagementSystem.Entity.Product;
import com.inventory.ProductManagementSystem.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ArrayList<Product> getAllProducts(){

        return (ArrayList<Product>) productRepository.findAll(Sort.by(Sort.Direction.ASC, "productId"));
    }

    public Product searchProductById(int productId)
    {
        return productRepository.findById(productId).orElse(null);
    }


    public void createProduct(Product product){
        productRepository.save(product);
    }

    public void updateProduct(Product updatedProduct)
    {
        Product oldProduct=productRepository.findById(updatedProduct.getProductId()).orElse(null);
        oldProduct.setQuantity(updatedProduct.getQuantity());
        productRepository.save(oldProduct);
    }

    public void updateProductByOrder(OrderProduct orderProduct)
    {
        Product oldProduct=productRepository.findById(orderProduct.getProductId()).orElse(null);
        oldProduct.setQuantity(orderProduct.getQuantity());
        productRepository.save(oldProduct);
    }

}
