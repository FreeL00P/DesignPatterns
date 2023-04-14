package com.freeloop.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * ObjectStructure
 *
 * @author fj
 * @since 2023/4/14 21:23
 */
//数据结构，管理很多人
public class ObjectStructure {
    //维护一个集合
    private  List<Person> persons=new LinkedList<>();
    //增加到list
    public void attach(Person person) {
        persons.add(person);
    }
    //移除
    public void detach(Person person) {
        persons.remove(person);
    }
    //显示测评情况
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
