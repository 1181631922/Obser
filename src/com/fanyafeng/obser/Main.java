package com.fanyafeng.obser;

import com.fanyafeng.obser.findjob.HeadHunter;
import com.fanyafeng.obser.findjob.JobSeeker;

/**
 * Created by fanyafeng on 16/6/27.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("测试观察者模式");

        HeadHunter headHunter = new HeadHunter();
        headHunter.registerObserver(new JobSeeker("Mike"));
        headHunter.registerObserver(new JobSeeker("Chris"));
        headHunter.registerObserver(new JobSeeker("Jeff"));

        headHunter.addJob("Google Job");
//        headHunter.addJob("Yahoo Job");
    }


}
