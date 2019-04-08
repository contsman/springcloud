package com.order.entity;

import java.util.Random;

/**
 * @author tc.wang
 * @date 19/4/6
 */
public class Order {
    private String orderNo = String.valueOf(System.currentTimeMillis());
    private Integer count = new Random().nextInt(100);

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
