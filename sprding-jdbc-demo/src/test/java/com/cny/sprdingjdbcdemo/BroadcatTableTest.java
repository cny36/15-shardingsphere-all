package com.cny.sprdingjdbcdemo;


import com.cny.sprdingjdbcdemo.dao.UserLevelRespository;
import com.cny.sprdingjdbcdemo.entity.UserLevelEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BroadcatTableTest {

    @Autowired
    private UserLevelRespository userLevelRespository;

    /**
     * 广播表（也叫字典表，全局表）
     * 每个库都存在一份完整的数据
     */
    @Test
    void orderTest() {
        UserLevelEntity userLevelEntity1 = new UserLevelEntity();
        userLevelEntity1.setUserLevel(1);
        userLevelEntity1.setName("黄金");
        userLevelRespository.save(userLevelEntity1);

        UserLevelEntity userLevelEntity2 = new UserLevelEntity();
        userLevelEntity2.setUserLevel(2);
        userLevelEntity2.setName("铂金");
        userLevelRespository.save(userLevelEntity2);
    }

}
