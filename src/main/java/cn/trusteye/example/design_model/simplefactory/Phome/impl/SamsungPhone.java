package cn.trusteye.example.design_model.simplefactory.Phome.impl;

import cn.trusteye.example.design_model.simplefactory.Phome.Phone;

/**
 * Created by rayman on 2017/7/6.
 */
public class SamsungPhone implements Phone {
    public String call(String name) {
        return "三星手机呼叫："+name;
    }
}
