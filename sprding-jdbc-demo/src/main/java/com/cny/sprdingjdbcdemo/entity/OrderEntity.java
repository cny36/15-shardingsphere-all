package com.cny.sprdingjdbcdemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author : chennengyuan
 */
@Entity
@Table(name = "t_order")
@Data
public class OrderEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sale_id")
    private long saleId;

    @Column(name = "title")
    private String title;

    @Column(name = "total_price")
    private long totalPrice;

}
