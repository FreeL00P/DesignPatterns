package com.freeloop.adapter.objectadapter;

/**
 * Voltage220V
 *
 * @author fj
 * @since 2023/4/9 13:14
 */
public class Voltage220V {
    public int output220V(){
        int src=220;
        System.out.println("电压="+src+"伏");
        return src;
    }
}
