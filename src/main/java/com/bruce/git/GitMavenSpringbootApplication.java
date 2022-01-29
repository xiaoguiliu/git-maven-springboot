package com.bruce.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitMavenSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitMavenSpringbootApplication.class, args);
        System.out.println("提交第一版");
        System.out.println("提交第二版");
        System.out.println("创建dev分支");

    }

}
