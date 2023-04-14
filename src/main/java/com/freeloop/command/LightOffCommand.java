package com.freeloop.command;

/**
 * LightOffCommand
 *
 * @author fj
 * @since 2023/4/14 10:33
 */
public class LightOffCommand implements Command {
    //聚合 LightReceiver
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者方法
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
