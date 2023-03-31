package com.cny.sprdingjdbcdemo;

import com.cny.sprdingjdbcdemo.dao.UserLevelRespository;
import com.cny.sprdingjdbcdemo.entity.UserLevelEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 读写分离测试
 */
@SpringBootTest
class ReadWriteTest {

    @Autowired
    private UserLevelRespository userLevelRespository;

    /**
     * 写操作(操作的是主库)
     */
    @Test
    void wirteTest() {
        UserLevelEntity userLevelEntity = new UserLevelEntity();
        userLevelEntity.setUserLevel(999);
        userLevelEntity.setName("999");
        userLevelRespository.save(userLevelEntity);
    }


    /**
     * 读操作(操作的是从库)
     */
    @Test
    void readTest() {
        List<UserLevelEntity> all = userLevelRespository.findAll();
        System.out.println(all);
    }

}
