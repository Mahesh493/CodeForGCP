package com.Customer.CustomerOrder.Registry;


import com.Customer.CustomerOrder.Entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, String> {
}
