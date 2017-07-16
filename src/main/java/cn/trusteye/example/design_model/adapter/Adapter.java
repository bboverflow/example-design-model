package cn.trusteye.example.design_model.adapter;

/**
 * Created by rayman on 2017/7/6.
 */
public interface Adapter {
    void updateDate(String orderid,String clinet);
    void updateDate(String orderid,String date,String client);
}
