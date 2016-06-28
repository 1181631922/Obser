package com.fanyafeng.obser.shopping;

import com.fanyafeng.obser.Observer;
import com.fanyafeng.obser.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by fanyafeng on 16/6/28.
 */
public class Shop implements Subject {
    private ArrayList<Observer> customerList;
    private ArrayList<String> messages;

    public Shop() {
        customerList = new ArrayList<>();
        messages = new ArrayList<>();
    }

    //订阅消息
    @Override
    public void registerObserver(Observer observer) {
        customerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyAllObservers() {//发布者,通知所有订阅者
        for (Observer observer : customerList) {
            observer.update(this);
        }
    }

    //店铺广播消息
    public void postMessage(String message) {
        this.messages.add(message);
        notifyAllObservers();
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    //店铺消息
    public String toString() {
        return messages.toString();
    }
}
