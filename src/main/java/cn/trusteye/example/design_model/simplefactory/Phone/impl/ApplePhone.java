package cn.trusteye.example.design_model.simplefactory.Phone.impl;

import cn.trusteye.example.design_model.simplefactory.Phone.Phone;

/**
 * Created by rayman on 2017/7/6.
 */
public class ApplePhone implements Phone {

    public String call(String messaage) {
        return "苹果手机呼叫："+messaage;
    }
}
