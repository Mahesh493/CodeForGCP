package com.Payment.OMS.Controller;

import com.Payment.OMS.Entity.OrderProduct;
import com.Payment.OMS.Entity.Product;
import com.Payment.OMS.Service.ProductService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/inventory")
@Api(value = "Product Management System")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/welcome")
    public String greetWelcome(){
        return "Welcome to OMS";
    }

    @GetMapping("/product/{productId}")
    @ApiOperation(value = "List all Products", response = Product.class)
    @ApiResponses(
            @ApiResponse(code = 200, message = "Success")
    )
    @ApiImplicitParam(name = "productId" ,value = "1000")
    public Product searchProductById(@PathVariable String productId) {
        return productService.searchProduct(productId);
    }

    @GetMapping("/product")
    public ArrayList<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/product")
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product)
    {
        productService.updateProduct(product);
    }

    @PutMapping("/product/ByOrder")
    public void updateProductByOrder(@RequestBody OrderProduct orderProduct)
    {
        productService.updateProductByOrder(orderProduct);
    }

}
