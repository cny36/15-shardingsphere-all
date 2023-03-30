package com.cny.sprdingjdbcdemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author : chennengyuan
 */
@Entity
@Table(name = "product_detail")
@Data
public class ProductDetailEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long pid;

    private String description;

}
