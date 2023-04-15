package com.freeloop.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * InfoCollage
 *
 * @author fj
 * @since 2023/4/15 14:41
 */
public class InfoCollage implements College{
    List<Department> departments;

    public InfoCollage() {
        this.departments = new ArrayList<Department>();
        this.addDepartment("信息安全","安全");
        this.addDepartment("信息加密","加密");
        this.addDepartment("信息盗取","开盒");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollageIterator(departments);
    }
}
