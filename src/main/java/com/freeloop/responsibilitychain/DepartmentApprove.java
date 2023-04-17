package com.freeloop.responsibilitychain;

/**
 * DepartmentApprover
 *
 * @author fj
 * @since 2023/4/17 20:13
 */
public class DepartmentApprove extends Approve{
    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest pur) {
        if(pur.getPrice()<=5000){
            System.out.println("请求编号"+pur.getId()+"被"+this.name+"处理");
        }else{
            approve.processRequest(pur);
        }
    }
}
