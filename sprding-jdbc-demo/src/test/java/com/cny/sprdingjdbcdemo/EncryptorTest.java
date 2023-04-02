package com.cny.sprdingjdbcdemo;

import com.cny.sprdingjdbcdemo.dao.UserRepository;
import com.cny.sprdingjdbcdemo.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 数据库字段加密 测试
 */
@SpringBootTest
class EncryptorTest {

    @Autowired
    private UserRepository userRepository;


    /**
     * pwd字段通过MD5加密
     * phone字段通过AES加密
     */
    @Test
    void addTest() {
        UserEntity user = new UserEntity();
        user.setUsername("zhangsna");
        user.setPwd("123456");
        user.setPhone("18038007883");

        UserEntity user2 = new UserEntity();
        user2.setUsername("lisi");
        user2.setPwd("123456");
        user2.setPhone("18038008888");

        userRepository.save(user);
        userRepository.save(user2);
    }


    /**
     * 验证效果
     */
    @Test
    void findTest() {
        List<UserEntity> byPwd = userRepository.findByPwd("123456");
        System.out.println(byPwd);
    }

}
