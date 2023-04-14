package com.freeloop.command;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/14 10:55
 */
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器对电灯的操作
        //创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //需要一个遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置相关命令，比如no=0是电灯的开和关操作
        remoteController.setCommands(0,lightOnCommand,lightOffCommand);
        //按下开灯
        remoteController.onButtonWasPushed(0);
        //按下关灯
        remoteController.offButtonWasPushed(0);
        //按下撤销
        remoteController.undoButtonWasPushed(0);
    }
}
