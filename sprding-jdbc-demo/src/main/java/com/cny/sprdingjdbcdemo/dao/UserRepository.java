package com.cny.sprdingjdbcdemo.dao;

import com.cny.sprdingjdbcdemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : chennengyuan
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByPwd(String pwd);
}
