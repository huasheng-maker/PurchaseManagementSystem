package com.purchasing.entity;


import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "purchase_order_item")
public class PurchaseOrderItem extends BaseEntity {

    private Integer orderId;

    private  Integer productId;

    //订购商品数量
    private Integer quantity;

    private BigDecimal unitPrice;
}
