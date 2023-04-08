package com.freeloop.builder.improve;

/**
 * HighHouseBuilder
 *
 * @author fj
 * @since 2023/4/8 21:52
 */
public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("给高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给高楼盖屋顶");
    }
}
