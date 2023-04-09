package com.freeloop.adapter.objectadapter;

/**
 * VoltageAdapter
 *
 * @author fj
 * @since 2023/4/9 13:18
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst=0;
        if(voltage220V!=null){
            System.out.println("使用对象适配器进行转换");
            //获取到220V电压
            int srcV =voltage220V.output220V();
            //转成5V
            dst=srcV/44;
        }
        return dst;
    }
}
