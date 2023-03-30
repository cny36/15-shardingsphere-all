package com.cny.sprdingjdbcdemo.dao;

import com.cny.sprdingjdbcdemo.entity.OrderEntity;
import com.cny.sprdingjdbcdemo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : chennengyuan
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
