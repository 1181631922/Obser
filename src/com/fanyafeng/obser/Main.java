package com.fanyafeng.obser;

import com.fanyafeng.obser.catchthief.Police;
import com.fanyafeng.obser.catchthief.Thief;
import com.fanyafeng.obser.findjob.HeadHunter;
import com.fanyafeng.obser.findjob.JobSeeker;
import com.fanyafeng.obser.shopping.Customer;
import com.fanyafeng.obser.shopping.Shop;

/**
 * Created by fanyafeng on 16/6/27.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("测试观察者模式");

//        HeadHunter headHunter = new HeadHunter();
//        headHunter.registerObserver(new JobSeeker("Mike"));
//        headHunter.registerObserver(new JobSeeker("Chris"));
//        headHunter.registerObserver(new JobSeeker("Jeff"));
//
//        headHunter.addJob("Google Job");
//        headHunter.addJob("Yahoo Job");

//        Shop shop = new Shop();
//        shop.registerObserver(new Customer("小红"));
//        shop.registerObserver(new Customer("小芳"));
//        shop.registerObserver(new Customer("广大女生"));
//
//        shop.postMessage("鞋子降价了");
//        shop.postMessage("零食降价了");

        Thief thief = new Thief();
        thief.registerObserver(new Police("警察1"));
        thief.sendMessage("小偷团伙要作案了");

        Thief thief1 = new Thief();
        thief1.sendMessage("手机不错,要顺手牵羊了");
    }


}
