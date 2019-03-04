package com.diligencetrack.diligencecommon;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取IP地址
 * Created by admin on 2019/2/18.
 */
public class IP {
    public static void main(String[] args) {
        try {
            Date day = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("本机的IP：" + InetAddress.getLocalHost());
            System.out.println("系统当前时间：" + df.format(day));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
