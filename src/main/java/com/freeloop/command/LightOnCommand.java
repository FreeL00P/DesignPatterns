package com.freeloop.command;

/**
 * LightOnCommand
 *
 * @author fj
 * @since 2023/4/14 10:29
 */
public class LightOnCommand implements Command{
    //聚合 LightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者方法
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
