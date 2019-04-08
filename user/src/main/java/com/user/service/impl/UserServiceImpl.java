package com.user.service.impl;

import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author tc.wang
 * @date 19/4/6
 */
@Service
public class UserServiceImpl implements UserService {
    private final static String ORDER_URL = "http://CLOUD-ORDER";
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    @Override
    public List findOrderListByUid(Integer id) {
        return restTemplate.getForObject(ORDER_URL + "/order/findAllByUid/" + id, List.class);
    }

    public List error(Integer id){
        return Lists.newArrayList("error.... order service " + id);
    }
}
