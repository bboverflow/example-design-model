package cn.trusteye.example.design_model.abstractfactory.impl;

import cn.trusteye.example.design_model.abstractfactory.PhoneFactory;
import cn.trusteye.example.design_model.simplefactory.Phone.Phone;
import cn.trusteye.example.design_model.simplefactory.Phone.impl.ApplePhone;

/**
 * Created by rayman on 2017/7/6.
 */
public class ApplePhoneFactory implements PhoneFactory {
    public Phone produce() {
        return new ApplePhone();
    }
}
