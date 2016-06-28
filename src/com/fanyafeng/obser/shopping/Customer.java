package com.fanyafeng.obser.shopping;

import com.fanyafeng.obser.Observer;
import com.fanyafeng.obser.Subject;

/**
 * Created by fanyafeng on 16/6/28.
 */
public class Customer implements Observer {

    private String customer;

    public Customer(String customer) {
        this.customer= customer;
    }

    @Override
    public void update(Subject subject) {//订阅者
        System.out.println("收到店铺消息的消费者:" + this.customer);
        System.out.println("店铺消息:" + subject.toString());
    }
}
