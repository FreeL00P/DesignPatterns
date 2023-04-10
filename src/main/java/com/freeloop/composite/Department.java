package com.freeloop.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Department
 *
 * @author fj
 * @since 2023/4/10 17:06
 */
public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(this.getName());
    }
}
