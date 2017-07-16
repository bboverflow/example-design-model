package cn.trusteye.example.design_model.decorator;

import cn.trusteye.example.design_model.decorator.impl.AndroidPhone;
import cn.trusteye.example.design_model.decorator.impl.Phone;

/**
 * Created by rayman on 2017/7/6.
 */
public class Client {
    public static void main(String[] args) {
        Callable phone = new AndroidPhone(new Phone());
        phone.call();
    }
}
