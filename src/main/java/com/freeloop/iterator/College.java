package com.freeloop.iterator;

import java.util.Iterator;

/**
 * College
 *
 * @author fj
 * @since 2023/4/15 14:25
 */
//学院
public interface College {
    String getName();
    //增加系的方法
    void addDepartment(String name, String desc);
    //返回一个迭代器遍历
    Iterator createIterator();
}
