package com.freeloop.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * InfoColleageIterator
 *
 * @author fj
 * @since 2023/4/15 14:16
 */
public class InfoCollageIterator implements Iterator {
    //信息工程学院是以list存放系的
    List<Department> departments ;
    int index=-1;
    public InfoCollageIterator(List<Department> departments) {
        this.departments = departments;
    }
    //判断集合还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >=departments.size()-1) {
            return false;
        }else{
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
    //空实现remove
    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
