package com.cny.sprdingjdbcdemo.dao;

import com.cny.sprdingjdbcdemo.entity.ProductDetailEntity;
import com.cny.sprdingjdbcdemo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Map;

/**
 * @author : chennengyuan
 */
public interface ProductDetailRepository extends JpaRepository<ProductDetailEntity, Long> {

    @Query(nativeQuery = true, value = "select p.id, p.name, p.price, pd.description from product p, product_detail pd where p.id = pd.pid and p.id = :id")
    Map<String, Object> findProductById(@Param("id") long id);
}
