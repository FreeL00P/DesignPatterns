package com.freeloop.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaer
 *
 * @author fj
 * @since 2023/4/16 14:45
 */
//备忘录管理
public class Caretaker {
    private List<Memento> mementoList=new ArrayList<Memento>();
    public void addMemento(Memento m) {
        mementoList.add(m);
    }
    public void remove(Memento m) {
        mementoList.remove(m);
    }
    //获取第index个Originator的备忘录对象
    public Memento get(int index){
        return mementoList.get(index);
    }
}
