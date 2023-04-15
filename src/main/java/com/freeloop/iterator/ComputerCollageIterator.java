package com.freeloop.iterator;

import java.util.Iterator;

/**
 * ComputerCollageIterator
 *
 * @author fj
 * @since 2023/4/15 14:08
 */
public class ComputerCollageIterator implements Iterator {
    //这里我们需要Department是以怎样的方式存放
    Department[] departments;
    int position=0;//遍历的位置
    @Override
    public boolean hasNext() {
        //判断是否还有下一个元素
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Object next() {
        return departments[position++];
    }
    //删除的方法默认空实现
    @Override
    public void remove() {

    }
    public  ComputerCollageIterator(Department[] departments) {
        this.departments = departments;
    }
}
