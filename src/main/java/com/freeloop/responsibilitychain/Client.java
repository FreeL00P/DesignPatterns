package com.freeloop.responsibilitychain;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/17 20:21
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 33100, 1);
        //创建相关审批人
        DepartmentApprove departmentApprove = new DepartmentApprove("主任");
        CollageApprove collageApprove = new CollageApprove("院长");
        ViceSchoolMasterApprove viceSchoolMasterApprove = new ViceSchoolMasterApprove("副校长");
        SchoolMasterApprove schoolMasterApprove = new SchoolMasterApprove("校长");
        //需要将各个审批的下一个处理者设置好 构成一个环形
        departmentApprove.setApprove(collageApprove);
        collageApprove.setApprove(viceSchoolMasterApprove);
        viceSchoolMasterApprove.setApprove(schoolMasterApprove);
        schoolMasterApprove.setApprove(departmentApprove);
        viceSchoolMasterApprove.processRequest(purchaseRequest);
    }
}
