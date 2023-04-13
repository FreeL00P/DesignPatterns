package com.freeloop.template.improve;

/**
 * PureSoyaMilk
 *
 * @author fj
 * @since 2023/4/13 16:26
 */
public class PureSoyaMilk extends SoyaMilk{

    @Override
    void addCondiment() {
        //空实现
    }
    //不需要配料
    @Override
    boolean customWant() {
        return false;
    }
}
