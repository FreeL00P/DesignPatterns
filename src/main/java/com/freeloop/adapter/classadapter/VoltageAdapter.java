package com.freeloop.adapter.classadapter;

/**
 * VoltageAdapter
 *
 * @author fj
 * @since 2023/4/9 13:18
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        //转成5V
        return srcV/44;
    }
}
