package com.fanyafeng.obser.findjob;

import com.fanyafeng.obser.Observer;
import com.fanyafeng.obser.Subject;

import java.util.ArrayList;

/**
 * Created by fanyafeng on 16/6/27.
 */
public class HeadHunter implements Subject {
    private ArrayList<Observer> userList;
    private ArrayList<String> jobs;

    public HeadHunter() {
        userList = new ArrayList<>();
        jobs = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : userList) {
            observer.update(this);
        }
    }

    public void addJob(String job) {
        this.jobs.add(job);
        notifyAllObservers();
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public String toString() {
        return jobs.toString();
    }
}
