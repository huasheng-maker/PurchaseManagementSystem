package com.purchasing.entity;

import javax.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "purchase_order")
public class PurchaseOrder extends BaseEntity{

    private String orderNo;

    private Integer supplierId;

    private BigDecimal totalAmount;

    private String status;


    //级联表示如果这张表(One)修改，对应关联的多条信息也会自动更新
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private List<PurchaseOrderItem> items;

}
