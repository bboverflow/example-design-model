package cn.trusteye.example.design_model.adapter;

import cn.trusteye.example.design_model.adapter.impl.AdapterImpl;
import cn.trusteye.example.design_model.adapter.impl.SourceImpl;

/**
 * Created by rayman on 2017/7/6.
 */
public class Client {
    public static void main(String[] args) {
        Source source = new SourceImpl();
        source.updateDate("1","1991-03-20","client1");

        Adapter adapter = new AdapterImpl();
        adapter.updateDate("1","client1");
    }
}
