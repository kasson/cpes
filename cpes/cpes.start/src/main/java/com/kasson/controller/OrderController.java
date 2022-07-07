package com.kasson.controller;

import com.kasson.domain.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KassonWu
 */
@RestController
public class OrderController {

    @CrossOrigin(origins = "*" ,maxAge = 3600)
   @RequestMapping("/getOrder")
    public List<Order> getOrder(){
        List<Order> orders = new ArrayList<>();
//       Order order = new Order();
//       order.setId(1);
//       order.setTitle("Iphone 18");
//       orders.add(order);

//        Order order2 = new Order();
//        order2.setId(1);
//        order2.setTitle("Iphone 18");
//        orders.add(order2);

        try {
            String url = "jdbc:mysql://172.23.8.123:3306/db_spring";
            String user = "kasson";
            String password = "admin@0107";
            Connection connection = DriverManager.getConnection(url,user,password);
            if (connection  != null ){
                Statement statement = connection.createStatement();
               ResultSet rs =  statement.executeQuery("select * from orders");
               while(rs.next()){
                   Order order = new Order();
                   order.setId(rs.getInt("id"));
                   order.setTitle(rs.getString("title"));
                   orders.add(order);
               }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return orders;
    }
}
