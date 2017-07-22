package cn.trusteye.example.design_model.simplefactory.two;

import cn.trusteye.example.design_model.simplefactory.Phone.Phone;
import cn.trusteye.example.design_model.simplefactory.Phone.impl.ApplePhone;
import cn.trusteye.example.design_model.simplefactory.Phone.impl.SamsungPhone;

/**
 * Created by rayman on 2017/7/6.
 * 通过用户调用不同工厂方法来生成不同产品
 */
public class PhoneFactory {
    public Phone produceApplePhone(){
        return new ApplePhone();
    }

    public Phone produceSamsungPhone(){
        return new SamsungPhone();
    }
}
