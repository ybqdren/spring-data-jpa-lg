package com.github.ybqdren;

import com.github.ybqdren.dao.UserRepository;
import com.github.ybqdren.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author zhao wen
 * @sice 2022/6/26
 **/

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        UserInfo user = userRepository.save(UserInfo.builder().name("jackxx").email("123456@126.com").build());
        assertNotNull(user);
        List<UserInfo> users= userRepository.findAll();
        System.out.println(users);
        assertNotNull(users);
    }
}
