package com.freeloop.adapter.classadapter;

/**
 * Phone
 *
 * @author fj
 * @since 2023/4/9 13:23
 */
public class Phone {
    //充电
    public void charging(IVoltage5V voltage5V){
        if ( voltage5V.output5V()==5){
            System.out.println("电压为5V，可以充电");
        }else{
            System.out.println("电压不符，不能充电");
        }
    }
}
