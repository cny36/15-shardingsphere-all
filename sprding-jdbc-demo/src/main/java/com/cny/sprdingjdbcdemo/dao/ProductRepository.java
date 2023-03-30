package com.cny.sprdingjdbcdemo.dao;

import com.cny.sprdingjdbcdemo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : chennengyuan
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
