package com.Customer.CustomerOrder.Controller;

import com.Customer.CustomerOrder.Entity.CustomerOrder;
import com.Customer.CustomerOrder.Registry.OrderProductInterface;
import com.Customer.CustomerOrder.Service.CustomerOrderService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@Api(value = "Order Management System")
public class CustomerOrderController {

    @Autowired
    private CustomerOrderService customerOrderService;

    @Autowired
    OrderProductInterface orderProductInterface;

    @GetMapping("/welcome")
    public String greetWelcome(){
        return "Welcome";
    }

    @GetMapping("/welcome/feign")
    public String getWelcomeFromFeign()
    {
        return "Welcome"+orderProductInterface.greetWelcome();
    }

    @GetMapping("/order/{orderId}")
    @ApiOperation(value = "List all Products", response = CustomerOrder.class)
    @ApiResponses(
            @ApiResponse(code = 200, message = "Success")
    )
    @ApiImplicitParam(name = "orderId" ,value = "2000")
    public CustomerOrder searchOrderById(@PathVariable String orderId) {
        return customerOrderService.searchOrder(orderId);
    }

    @GetMapping("/order")
    public ArrayList<CustomerOrder> getAllOrders() {
        return customerOrderService.getAllOrders();
    }

    @PostMapping("/order")
    public void createOrder(@RequestBody CustomerOrder customerOrder) {
        customerOrderService.createOrder(customerOrder);
    }

    @PutMapping("/order")
    public void updateOrder(@RequestBody CustomerOrder customerOrder)
    {
        customerOrderService.updateOrder(customerOrder);
    }


}
