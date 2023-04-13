package com.freeloop.template.improve;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/13 16:14
 */
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        SoyaMilk redBeanSoyamilk = new RedBeanSoyamilk();
        redBeanSoyamilk.make();
        System.out.println("=====");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        //不加配料
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
