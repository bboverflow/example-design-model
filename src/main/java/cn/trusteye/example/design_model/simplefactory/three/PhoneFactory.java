package cn.trusteye.example.design_model.simplefactory.three;

import cn.trusteye.example.design_model.simplefactory.Phome.Phone;
import cn.trusteye.example.design_model.simplefactory.Phome.impl.ApplePhone;
import cn.trusteye.example.design_model.simplefactory.Phome.impl.SamsungPhone;

/**
 * Created by rayman on 2017/7/6.
 */
public class PhoneFactory {
    static public Phone produceApplePhone(){
        return new ApplePhone();
    }

    static public Phone produceSamsungPhone(){
        return new SamsungPhone();
    }

}
