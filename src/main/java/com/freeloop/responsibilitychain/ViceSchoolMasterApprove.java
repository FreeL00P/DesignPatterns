package com.freeloop.responsibilitychain;

/**
 * ViceSchoolMasterApprove
 *
 * @author fj
 * @since 2023/4/17 20:18
 */
public class ViceSchoolMasterApprove extends Approve{
    public ViceSchoolMasterApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest pur) {
        if(pur.getPrice()>1000&&pur.getPrice()<=30000){
            System.out.println("请求编号"+pur.getId()+"被"+this.name+"处理");
        }else{
            approve.processRequest(pur);
        }
    }
}
