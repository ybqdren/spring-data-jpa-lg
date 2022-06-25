package com.github.ybqdren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author zhao wen
 * @sice 2022/6/25
 **/

@EntityScan(basePackages = "com.github.ybqdren.entity")
@SpringBootApplication
public class JpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class,args);
    }
}
