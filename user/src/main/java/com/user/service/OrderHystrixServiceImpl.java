package com.user.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tc.wang
 * @date 19/4/8
 */
@Service
public class OrderHystrixServiceImpl implements OrderHystrixService{
    @Override
    public List orderHystrixService() {
        return new ArrayList();
    }
}
