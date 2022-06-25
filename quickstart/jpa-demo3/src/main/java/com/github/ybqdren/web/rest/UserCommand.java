package com.github.ybqdren.web.rest;

import com.github.ybqdren.dao.UserRepository;
import com.github.ybqdren.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhao wen
 * @sice 2022/6/26
 **/

@RestController
@RequestMapping(path = "/api/v1")
public class UserCommand {

    @Autowired
    UserRepository userRepository;

    @PostMapping(path = "user",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public UserInfo addNewUser(@RequestBody UserInfo user) {
        return userRepository.save(user);
    }

}
