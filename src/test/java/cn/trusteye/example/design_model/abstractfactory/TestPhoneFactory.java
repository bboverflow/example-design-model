package cn.trusteye.example.design_model.abstractfactory;

import cn.trusteye.example.design_model.abstractfactory.impl.ApplePhoneFactory;
import cn.trusteye.example.design_model.simplefactory.Phome.Phone;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rayman on 2017/7/6.
 */
public class TestPhoneFactory {
    @Test
    public void testPhoneFactory(){
        PhoneFactory factory = new ApplePhoneFactory();
        Phone phone = factory.produce();
        String result = phone.call("Jerry");
        Assert.assertEquals("抽象工厂测试失败","苹果手机呼叫：Jerry",result);
    }
}
