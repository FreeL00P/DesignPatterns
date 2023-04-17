package com.freeloop.responsibilitychain;

import lombok.Data;

/**
 * PurchaseRequest
 *
 * @author fj
 * @since 2023/4/17 20:07
 */
@Data
public class PurchaseRequest {
    private int type=0;//请求类型
    private float price=0.0f;
    private int id=0;

    public PurchaseRequest(int type,float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }
}
