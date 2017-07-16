package cn.trusteye.example.design_model.simplefactory.one;

import cn.trusteye.example.design_model.simplefactory.Phome.Phone;
import cn.trusteye.example.design_model.simplefactory.Phome.impl.ApplePhone;
import cn.trusteye.example.design_model.simplefactory.Phome.impl.SamsungPhone;

/**
 * Created by rayman on 2017/7/6.
 */
public class PhoneFactory {
    public Phone produce(String phoneType){
        if(phoneType.equals("apple")){
            return new ApplePhone();
        }
        else if(phoneType.equals("samsung")){
            return new SamsungPhone();
        }
        return null;
    }
}
