package com.freeloop.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Collage
 *
 * @author fj
 * @since 2023/4/10 17:02
 */
public class Collage extends OrganizationComponent{
    //这个list中存放的是Department
    List<OrganizationComponent> organizationComponents=new ArrayList<>();

    public Collage(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    //print()方法就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("=========="+this.getName()+"==========");
        //打印出
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
