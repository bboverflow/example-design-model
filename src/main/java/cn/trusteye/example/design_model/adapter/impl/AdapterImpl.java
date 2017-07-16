package cn.trusteye.example.design_model.adapter.impl;

import cn.trusteye.example.design_model.adapter.Adapter;
import cn.trusteye.example.design_model.adapter.Source;

/**
 * Created by rayman on 2017/7/6.
 */
public class AdapterImpl implements Adapter{
    Source source;

    public AdapterImpl() {
        source = new SourceImpl();
    }

    public void updateDate(String orderid, String clinet) {
        source.updateDate(orderid,"1991-03-01",clinet);
    }

    @Override
    public void updateDate(String orderid, String date, String client) {
        source.updateDate(orderid,date,client);
    }
}
