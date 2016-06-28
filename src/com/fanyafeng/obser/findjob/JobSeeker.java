package com.fanyafeng.obser.findjob;

import com.fanyafeng.obser.Observer;
import com.fanyafeng.obser.Subject;

/**
 * Created by fanyafeng on 16/6/28.
 */
public class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(this.name + "got notified");
        System.out.println(subject);
    }

}
