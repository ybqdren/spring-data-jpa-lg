package com.github.ybqdren.dao;

import com.github.ybqdren.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhao wen
 * @sice 2022/6/26
 **/


public interface UserRepository extends JpaRepository<UserInfo, Long> {

}
