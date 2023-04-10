package com.freeloop.bridge;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/9 22:43
 */
public class Client {
    public static void main(String[] args) {
        //获取折叠手机
        Phone foldPhone = new FoldPhone(new XIaoMI());
        foldPhone.open();
        foldPhone.close();
        foldPhone.close();

        Phone foldPhone1 = new UpRightPhone(new Vivo());
        foldPhone1.open();
        foldPhone1.call();
        foldPhone1.close();
    }
}
