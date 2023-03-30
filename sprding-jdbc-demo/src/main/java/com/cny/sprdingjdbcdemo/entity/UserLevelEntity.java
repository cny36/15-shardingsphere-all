package com.cny.sprdingjdbcdemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author : chennengyuan
 */
@Entity
@Table(name = "t_user_level")
@Data
public class UserLevelEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_level")
    private int userLevel;

    @Column(name = "name")
    private String name;

}
