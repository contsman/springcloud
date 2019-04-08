package com.order.controller;

import com.order.entity.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author tc.wang
 * @date 19/4/6
 */
@RestController
@RequestMapping("order")
public class OrderController {
    @RequestMapping("findAllByUid/{uid}")
    public List<Order> index(@PathVariable("uid") Integer uid){
        System.out.println(String.format("find order by uid %s", uid));
        return Arrays.asList(new Order(), new Order(), new Order());
    }

    @RequestMapping("findById/{id}")
    public Order findById(@PathVariable("id") Integer id){
        System.out.println(String.format("find order by id %s", id));
        return new Order();
    }
}
