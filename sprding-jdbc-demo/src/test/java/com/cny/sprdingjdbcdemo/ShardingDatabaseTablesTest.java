package com.cny.sprdingjdbcdemo;

import com.cny.sprdingjdbcdemo.dao.OrderRepository;
import com.cny.sprdingjdbcdemo.entity.OrderEntity;
import org.aspectj.weaver.ast.Or;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Optional;

/**
 * 水平分库分表测试
 */
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


    @Test
    void queryTest() {
        //该ID是属于 ordermaster0.t_ordero，但是由于表分片键是order.id，程序只知道是在t_order0表中，不知道是在那个库中
        //Optional<OrderEntity> order = orderRepository.findById(848687874009202688L);

        //指定表分片键和库分片键后，即可确定是在哪个库哪个表中
        OrderEntity entity = new OrderEntity();
        entity.setId(848687874009202688L);
        entity.setSaleId(2L);
        Example<OrderEntity> entityExample = Example.of(entity);
        List<OrderEntity> list = orderRepository.findAll(entityExample);
        System.out.println(list);
    }

}
