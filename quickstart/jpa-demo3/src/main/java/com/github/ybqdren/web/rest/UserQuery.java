package com.github.ybqdren.web.rest;

import com.github.ybqdren.dao.UserRepository;
import com.github.ybqdren.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhao wen
 * @sice 2022/6/26
 **/

@RestController
@RequestMapping(path = "/api/v1")
public class UserQuery {

    @Autowired
    UserRepository userRepository;

    /**
     * 根据分页信息查询用户
     * @param request
     * @return
     */
    @GetMapping(path = "users")
    @ResponseBody
    public Page<UserInfo> getAllUsers(Pageable request) {
        return userRepository.findAll(request);
    }
}
