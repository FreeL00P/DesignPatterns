package com.freeloop.principle.demeter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Demeter1
 *
 * @author fj
 * @since 2023/4/5 13:56
 */
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        //schoolManager.getAllEmployee();
        schoolManager.printAllEmployee(new CollageManager());
    }
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
        //分析问题
        //这里的CollegeEmployee 不是SchoolManage的直接朋友
        //CollegeEmployee是以局部变量的方式出现在SchoolManger
        //违背的迪米特原则
        List<CollageEmployee> list1=sub.getAllEmployee();
        System.out.println("==========分公司员工==========");
        for (CollageEmployee e : list1) {
            System.out.println("e = " + e.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("==========学校总部员工==========");
        for (Employee employee : list2) {
            System.out.println("employee = " + employee.getId());
        }
    }
}