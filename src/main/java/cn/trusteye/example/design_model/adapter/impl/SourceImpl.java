package cn.trusteye.example.design_model.adapter.impl;

import cn.trusteye.example.design_model.adapter.Source;

/**
 * Created by rayman on 2017/7/6.
 */
public class SourceImpl implements Source {
    public void updateDate(String orderId, String date, String client) {
        System.out.println(client + "已将订单" + orderId + "的有效期延长至" + date);
    }
}
