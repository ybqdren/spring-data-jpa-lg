package com.github.ybqdren.dao;

import com.github.ybqdren.dao.UserRepository;
import com.github.ybqdren.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.init.DataSourceScriptDatabaseInitializer;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author zhao wen
 * @sice 2022/6/26
 **/

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;


    /**
     Hibernate: call next value for hibernate_sequence
     Hibernate: insert into user_info (email, name, id) values (?, ?, ?)
     Hibernate: select userinfo0_.id as id1_0_, userinfo0_.email as email2_0_, userinfo0_.name as name3_0_ from user_info userinfo0_
     [UserInfo(id=1, name=jackxx, email=123456@126.com)]
     */
    @Test
    public void testSaveUser() {
        UserInfo user = userRepository.save(UserInfo.builder().name("jackxx").email("123456@126.com").build());
        assertNotNull(user);
        List<UserInfo> users= userRepository.findAll();
        System.out.println(users);
        assertNotNull(users);
    }
}
