package com.freeloop.command;

/**
 * RemoteController
 *
 * @author fj
 * @since 2023/4/14 10:38
 */
public class RemoteController {
    //开按钮的命令数组
    Command[] onCommands;
    //关按钮的命令数组
    Command[] offCommands;
    //执行撤销的命令
    Command undoCommand;

    public RemoteController() {
        onCommands=new Command[5];
        offCommands=new Command[5];
        for (int i = 0; i < 5; i++) {
            //使用空命令进行初始化
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    //给我们的按钮设置需要的命令
    public void setCommands(int no,Command onCommand,Command offCommand){
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
    }
    //按下开的按钮
    public void onButtonWasPushed(int no){
        //找到你按开的按钮，调用对应方法
        onCommands[no].execute();
        //记录本次操作，用于撤销
        undoCommand=onCommands[no];
    }
    //按下关的按钮
    public void offButtonWasPushed(int no){
        //找到你按开的按钮，调用对应方法
        offCommands[no].execute();
        //记录本次操作，用于撤销
        undoCommand=offCommands[no];
    }
    //按下撤销的按钮
    public void undoButtonWasPushed(int no){
      undoCommand.undo();
    }
}
