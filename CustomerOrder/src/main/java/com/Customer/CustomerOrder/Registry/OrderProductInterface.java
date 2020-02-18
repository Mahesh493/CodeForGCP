package com.Customer.CustomerOrder.Registry;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("productOrder")
public interface OrderProductInterface {

    @GetMapping("/inventory/welcome")
    public String greetWelcome();
}
