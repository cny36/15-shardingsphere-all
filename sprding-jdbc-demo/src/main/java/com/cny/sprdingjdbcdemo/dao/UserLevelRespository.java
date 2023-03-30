package com.cny.sprdingjdbcdemo.dao;

import com.cny.sprdingjdbcdemo.entity.ProductEntity;
import com.cny.sprdingjdbcdemo.entity.UserLevelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : chennengyuan
 */
public interface UserLevelRespository extends JpaRepository<UserLevelEntity, Long> {

}
