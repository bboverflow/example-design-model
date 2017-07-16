package cn.trusteye.example.design_model.decorator.impl;

import cn.trusteye.example.design_model.decorator.Callable;

/**
 * Created by rayman on 2017/7/6.
 */
public class Phone implements Callable{
    @Override
    public void call() {
        System.out.println("电话呼叫");
    }
}
