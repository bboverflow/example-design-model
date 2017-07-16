package cn.trusteye.example.design_model.decorator.impl;

import cn.trusteye.example.design_model.decorator.Callable;

/**
 * Created by rayman on 2017/7/6.
 */
public class AndroidPhone implements Callable {
    Callable phone;

    public AndroidPhone(Callable phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        System.out.println("发彩信");
        phone.call();
        System.out.println("逛网站");
    }
}
