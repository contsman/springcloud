package com.user.controller;

import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tc.wang
 * @date 19/4/6
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public String index(){
        System.out.println("user index http interface....");
        return "hello user";
    }

    @RequestMapping("orderList")
    public Object orderList(){
        System.out.println("user index http interface....");
        return userService.findOrderListByUid(1);
    }


}
