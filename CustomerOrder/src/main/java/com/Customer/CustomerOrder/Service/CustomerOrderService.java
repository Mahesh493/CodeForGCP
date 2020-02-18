package com.Customer.CustomerOrder.Service;

import com.Customer.CustomerOrder.Entity.CustomerOrder;
import com.Customer.CustomerOrder.Registry.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerOrderService {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    public CustomerOrder searchOrder(String orderId) {
        return customerOrderRepository.findById(orderId).orElse(null);
    }

    public ArrayList getAllOrders() {
        return (ArrayList) customerOrderRepository.findAll(Sort.by(Sort.Direction.ASC, "date"));
    }

    public void createOrder(CustomerOrder customerOrder) {
        customerOrderRepository.save(customerOrder);
    }

    public void updateOrder(CustomerOrder updatedCustomerOrder) {

    }

}
