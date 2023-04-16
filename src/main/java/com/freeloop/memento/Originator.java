package com.freeloop.memento;

import lombok.Data;

/**
 * Originator
 *
 * @author fj
 * @since 2023/4/16 14:37
 */
//发起人
@Data
public class Originator {
    private String state;
    //编写一个方法，可以保存一个状态对象Memento
    //因此编写一个方法返回一个memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }
    //通过备忘录对象，回复状态
    public void getStateFromMemento(Memento memento){
        state= memento.getState();
    }
}
