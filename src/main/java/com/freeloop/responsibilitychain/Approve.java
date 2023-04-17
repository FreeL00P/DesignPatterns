package com.freeloop.responsibilitychain;

import lombok.Data;

/**
 * Approver
 *
 * @author fj
 * @since 2023/4/17 20:09
 */

@Data
public abstract class Approve {
    Approve approve;//下一个处理者
    String name;//名字

    public Approve(String name) {
        this.name=name;
    }
    //下一个处理者
    public Approve(Approve approve) {
        this.approve = approve;
    }
    //处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
