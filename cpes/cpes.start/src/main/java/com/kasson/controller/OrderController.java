package com.kasson.controller;

import com.kasson.domain.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KassonWu
 */
@RestController
public class OrderController {

   @RequestMapping("/getOrder")
    public Order getOrder(){

       Order order = new Order();
       order.setId(1);
       order.setTitle("Iphone 18");
        return order;
    }
}
