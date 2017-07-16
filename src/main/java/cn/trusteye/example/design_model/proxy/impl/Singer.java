package cn.trusteye.example.design_model.proxy.impl;

import cn.trusteye.example.design_model.proxy.Person;

/**
 * Created by rayman on 2017/7/7.
 */
public class Singer implements Person{

    @Override
    public void work() {
        System.out.println("歌星唱歌");
    }
}
