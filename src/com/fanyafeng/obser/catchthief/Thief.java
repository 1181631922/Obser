package com.fanyafeng.obser.catchthief;

import com.fanyafeng.obser.Observer;
import com.fanyafeng.obser.Subject;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by fanyafeng on 16/6/30.
 */
public class Thief implements Subject {

    private ArrayList<Observer> policeList;
    private ArrayList<String> messages;

    public Thief() {
        policeList = new ArrayList<>();
        messages = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        policeList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : policeList) {
            observer.update(this);
        }
    }

    public void sendMessage(String message) {
        this.messages.add(message);
        notifyAllObservers();
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public String toString() {
        return messages.toString();
    }
}
