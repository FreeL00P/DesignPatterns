package com.freeloop.iterator;

import java.util.Iterator;

/**
 * ComputerCollege
 *
 * @author fj
 * @since 2023/4/15 14:29
 */
public class ComputerCollege implements College{
    Department[] departments;
    int numOfDepartment=0;//保存当前数组的对象个数

    public ComputerCollege() {
        departments=new Department[5];
        addDepartment("JAVA","咖啡");
        addDepartment("Python","蟒蛇");
        addDepartment("C","语言");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
       departments[numOfDepartment]= new Department(name, desc);
       numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollageIterator(departments);
    }
}
