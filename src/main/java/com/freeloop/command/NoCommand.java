package com.freeloop.command;

/**
 * NoCommand
 *
 * @author fj
 * @since 2023/4/14 10:35
 */
//空执行 用于初始化每个按钮，当调用空命令时，对象什么都不做，
// 这也是一种设计模式，可以省掉对空的判断
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
