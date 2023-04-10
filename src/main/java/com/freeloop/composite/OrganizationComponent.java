package com.freeloop.composite;

/**
 * OrganizationComponent
 *
 * @author fj
 * @since 2023/4/10 16:45
 */
public abstract class OrganizationComponent {
    private String name;
    private String des;
    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    //方法print
    protected abstract void print();

    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
