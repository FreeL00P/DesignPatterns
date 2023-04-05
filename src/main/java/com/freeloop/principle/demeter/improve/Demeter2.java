package com.freeloop.principle.demeter.improve;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Demeter2
 * 迪米特原则
 * @author fj
 * @since 2023/4/5 14:21
 */
public class Demeter2 {

}
@Data
class Employee{
    private String id;
}
@Data
class CollageEmployee{
    private String id;
}
class CollageManager{
    public List<CollageEmployee> getAllEmployee(){
        List<CollageEmployee> list = new ArrayList<CollageEmployee>();
        for (int i = 0; i <10 ; i++) {
            CollageEmployee emp=new CollageEmployee();
            emp.setId("学院员工id="+i);
            list.add(emp);
        }
        return list;
    }
    //输出学院员工的信息
    public void printEmployee(){
        List<CollageEmployee> list1=getAllEmployee();
        System.out.println("==========分公司员工==========");
        for (CollageEmployee e : list1) {
            System.out.println("e = " + e.getId());
        }
    }
}
//学校管理类
class SchoolManager{
    //返回学校总部员工
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i <5 ; i++) {
            Employee emp=new Employee();
            emp.setId("学院总部员工id="+i);
            list.add(emp);
        }
        return list;
    }
    //完成输出学校总部和学院员工
    void printAllEmployee(CollageManager sub){
        sub.printEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("==========学校总部员工==========");
        for (Employee employee : list2) {
            System.out.println("employee = " + employee.getId());
        }
    }
}