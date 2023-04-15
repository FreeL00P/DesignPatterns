package com.freeloop.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * OutPutImpl
 *
 * @author fj
 * @since 2023/4/15 14:48
 */
public class OutPutImpl {
    //获取学院集合
    List<College> collegeList;

    //需要一个构造器

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    //遍历所有的学院,输出各个学院的系
    public void printCollage(){
        //从collageList取出所有的学院 java中的list已经实现了Iterator接口
        for (College college : collegeList) {
            //取出一个学院
            System.out.println("学院名称==>" + college.getName());
            //取出学院的Iterator
            Iterator collegeIterator = college.createIterator();
            printDepartment(collegeIterator);
        }
    }
    //输出，学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department=(Department) iterator.next();
            System.out.println("系名称==>"+department.getName());
        }
    }
}
