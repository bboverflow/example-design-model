package cn.trusteye.example.design_model.proxy;

import cn.trusteye.example.design_model.proxy.impl.Proxy;
import org.junit.Test;

/**
 * Created by rayman on 2017/7/7.
 * 调用者和代理打交道，代理来和具体对象打交道
 */
public class ProxyTest {
    @Test
    public void testProxy(){
        Person proxy = new Proxy();
        proxy.work();
    }
}
