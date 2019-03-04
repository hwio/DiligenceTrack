package com.diligencetrack.diligencecommon;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义单号生成器
 * Created by admin on 2019/2/18.
 */
public enum OrderNumberFactory {
    leave("LE", "请假编号");

    private String orderName;
    private String prefixNum;
    private Integer orderNum = Integer.valueOf(1);
    private Long lastTime = Long.valueOf(new Date().getTime());

    private OrderNumberFactory(String prefixNum, String orderName) {
        this.prefixNum = prefixNum;
        this.orderName = orderName;
    }

    public synchronized String getOrderNumber() {
        Long newLastTime;
        if (this.lastTime.longValue() < (newLastTime = Long.valueOf(new Date().getTime()))) {
            this.orderNum = Integer.valueOf(1);
            this.lastTime = newLastTime;
        }

        String dataPart = (new SimpleDateFormat("yyyyMMddHHmm")).format(new Date());
        DecimalFormat var10000 = new DecimalFormat();
        Integer var4 = this.orderNum;
        Integer var5 = this.orderNum = Integer.valueOf(this.orderNum.intValue() + 1);
        String numberPart = var10000.format(var4);
        return this.prefixNum + dataPart + numberPart;
    }

    public String getOrderName() {
        return this.orderName;
    }

    public String getPrefixNum() {
        return this.prefixNum;
    }

    public Integer getOrderNum() {
        return this.orderNum;
    }
}
