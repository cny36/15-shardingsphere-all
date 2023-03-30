package com.cny.sprdingjdbcdemo;

import com.cny.sprdingjdbcdemo.dao.OrderRepository;
import com.cny.sprdingjdbcdemo.entity.OrderEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingDatabaseTablesTest {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * 实现水平分库分表
     */
    @Test
    void orderTest() {
        //以下数据全部在一个库中，不同的表
        for (int i = 1; i <= 10; i++) {
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setSaleId(1L);
            orderEntity.setTitle("xiaomi");
            orderEntity.setTotalPrice(10000L);
            orderRepository.save(orderEntity);
        }

        //以下数据全部在一个库中，不同的表
        for (int i = 1; i <= 10; i++) {
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setSaleId(2L);
            orderEntity.setTitle("xiaomi");
            orderEntity.setTotalPrice(10000L);
            orderRepository.save(orderEntity);
        }
    }

}
