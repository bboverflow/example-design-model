package cn.trusteye.example.design_model.simplefactory.one;

import cn.trusteye.example.design_model.simplefactory.Phone.Phone;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rayman on 2017/7/6.
 */
public class TestFactory {

    @Test
    public void testFactory(){
        Phone phone = new PhoneFactory().produce("apple");
        String result;
        result = phone.call("Tom");
        Assert.assertEquals("不相同","苹果手机呼叫：Tom",result);
    }
}
