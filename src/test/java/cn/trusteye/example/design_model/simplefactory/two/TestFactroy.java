package cn.trusteye.example.design_model.simplefactory.two;

import cn.trusteye.example.design_model.simplefactory.Phone.Phone;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rayman on 2017/7/6.
 */
public class TestFactroy {
    @Test
    public void testFactory(){
        Phone mail = new PhoneFactory().produceApplePhone();
        String result;
        result = mail.call("Tom");
        Assert.assertEquals("不相同","苹果手机呼叫：Tom",result);
    }

}
