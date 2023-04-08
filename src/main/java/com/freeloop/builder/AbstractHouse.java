package com.freeloop.builder;

/**
 * AbstractHouse
 *
 * @author fj
 * @since 2023/4/8 21:13
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
