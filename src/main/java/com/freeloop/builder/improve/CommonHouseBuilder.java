package com.freeloop.builder.improve;

/**
 * CommonHouse
 *
 * @author fj
 * @since 2023/4/8 21:50
 */
public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
