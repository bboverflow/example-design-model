package cn.trusteye.example.design_model.simplefactory.three;

import cn.trusteye.example.design_model.simplefactory.Phone.Phone;
import cn.trusteye.example.design_model.simplefactory.Phone.impl.ApplePhone;
import cn.trusteye.example.design_model.simplefactory.Phone.impl.SamsungPhone;

/**
 * Created by rayman on 2017/7/6.
 * 静态工厂
 */
public class PhoneFactory {
    static public Phone produceApplePhone(){
        return new ApplePhone();
    }

    static public Phone produceSamsungPhone(){
        return new SamsungPhone();
    }

}
