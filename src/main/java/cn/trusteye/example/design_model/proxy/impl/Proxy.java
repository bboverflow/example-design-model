package cn.trusteye.example.design_model.proxy.impl;

import cn.trusteye.example.design_model.proxy.Person;

/**
 * Created by rayman on 2017/7/7.
 */
public class Proxy implements Person {
    Person singer;

    public Proxy() {
        this.singer = new Singer();
    }

    @Override
    public void work() {
        System.out.println("约歌星");
        singer.work();
        System.out.println("付款");
    }
}
