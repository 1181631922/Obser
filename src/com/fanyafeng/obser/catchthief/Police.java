package com.fanyafeng.obser.catchthief;

import com.fanyafeng.obser.Observer;
import com.fanyafeng.obser.Subject;

/**
 * Created by fanyafeng on 16/6/30.
 */
public class Police implements Observer {

    private String police;

    public Police(String police) {
        this.police = police;
    }

    @Override
    public void update(Subject subject) {
        System.out.println("收到线报的警察:" + this.police);
        System.out.println("收到卧底的线报:"+subject.toString());
    }
}
