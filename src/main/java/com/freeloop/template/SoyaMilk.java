package com.freeloop.template;

/**
 * SoyaMilk
 * 模板方法模式
 * @author fj
 * @since 2023/4/13 15:52
 */
//
public abstract class SoyaMilk {
    //模板方法，make 模板方法可以做成final，不让子类去覆盖
    final void make(){
        select();
        addCondiment();
        soak();
        beat();
    }
    //选材料
    void select(){
        System.out.println("1选好材料--新鲜黄豆");
    }
    //添加不同的配料，抽象方法
    abstract void addCondiment();
    //浸泡
    void soak(){
        System.out.println("3黄豆和材料开始浸泡");
    }
    void beat(){
        System.out.println("4黄豆和配料放入豆浆机");
    }
}
