package com.freeloop.responsibilitychain;

/**
 * CollageApprove
 *
 * @author fj
 * @since 2023/4/17 20:16
 */
public class CollageApprove extends Approve{
    public CollageApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest pur) {
        if(pur.getPrice()>5000&&pur.getPrice()<=10000){
            System.out.println("请求编号"+pur.getId()+"被"+this.name+"处理");
        }else{
            approve.processRequest(pur);
        }
    }
}
