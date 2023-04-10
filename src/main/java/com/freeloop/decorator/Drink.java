package com.freeloop.decorator;

import lombok.Data;

/**
 * Drink
 *
 * @author fj
 * @since 2023/4/10 10:55
 */

public abstract class Drink {
    public String des;
    private float price=0.0f;
    //计算费用的抽象方法
    public abstract  float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "描述='" + des + '\'' +
                ", 价格=" + price +
                '}';
    }
}
