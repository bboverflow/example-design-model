package cn.trusteye.example.design_model.decorator;

import cn.trusteye.example.design_model.decorator.impl.AndroidPhone;
import cn.trusteye.example.design_model.decorator.impl.Phone;
import org.junit.Test;


/**
 * Created by rayman on 2017/7/7.
 * 和代理模式的区别：
 * 调用者明确要对哪个类进行功能增强
 */
public class CallableTest {
    @Test
    public void testCallable(){
        Callable phone = new AndroidPhone(new Phone());
        phone.call();
    }
}
