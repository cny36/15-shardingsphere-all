package com.cny.sprdingjdbcdemo;

import com.cny.sprdingjdbcdemo.dao.ProductDetailRepository;
import com.cny.sprdingjdbcdemo.dao.ProductRepository;
import com.cny.sprdingjdbcdemo.entity.ProductDetailEntity;
import com.cny.sprdingjdbcdemo.entity.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class SprdingJdbcTests {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductDetailRepository productDetailRepository;

    /**
     * 实现垂直分表+水平分库
     */
    @Test
    void addTest() {
        for (int i = 1; i <= 10; i++) {
            ProductEntity entity = new ProductEntity();
            entity.setName("Mi" + i);
            entity.setPrice(2000 + i);
            productRepository.save(entity);

            ProductDetailEntity detailEntity = new ProductDetailEntity();
            detailEntity.setPid(entity.getId());
            detailEntity.setDescription("性价比超级高");
            productDetailRepository.save(detailEntity);
        }
    }


    /**
     * 验证效果
     */
    @Test
    void findTest() {
        Map<String, Object> map = productDetailRepository.findProductById(847964510605017088L);
        System.out.println(map);
    }

}
