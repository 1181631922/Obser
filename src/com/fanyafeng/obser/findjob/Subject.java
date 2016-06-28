package com.fanyafeng.obser.findjob;

/**
 * Created by fanyafeng on 16/6/27.
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyAllObservers();
}
