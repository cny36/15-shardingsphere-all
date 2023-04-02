package com.cny.sprdingjdbcdemo.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author : chennengyuan
 */
@Entity
@Table(name = "t_user")
@Data
@ToString
public class UserEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "phone")
    private String phone;


    /**
     * 逻辑列 面向编程
     */
    @Column(name = "pwd")
    private String pwd;

}
