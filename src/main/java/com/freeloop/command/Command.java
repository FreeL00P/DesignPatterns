package com.freeloop.command;

/**
 * Command
 *
 * @author fj
 * @since 2023/4/14 10:27
 */
//创建命令接口
public interface Command {
    //执行操作
    void execute();
    //撤销操作
    void undo();
}
