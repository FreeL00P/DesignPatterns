package com.freeloop.responsibilitychain;

/**
 * SchoolMasterApprove
 *
 * @author fj
 * @since 2023/4/17 20:19
 */
public class SchoolMasterApprove extends Approve{
    public SchoolMasterApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest pur) {
        if(pur.getPrice()>30000){
            System.out.println("请求编号"+pur.getId()+"被"+this.name+"处理");
        }else{
            approve.processRequest(pur);
        }
    }
}
