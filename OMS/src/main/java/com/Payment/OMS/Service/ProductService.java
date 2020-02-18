package com.Payment.OMS.Service;

import com.Payment.OMS.Entity.OrderProduct;
import com.Payment.OMS.Entity.Product;
import com.Payment.OMS.Registry.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product searchProduct(String prodId) {
        return productRepository.findById(prodId).orElse(null);
    }

    public ArrayList getAllProducts(){
        return (ArrayList)productRepository.findAll(Sort.by(Sort.Direction.ASC,"productId"));
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
