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
        System.out.println("master制造冲突分支");

        System.out.println("dev分支制造冲突代码");
        System.out.println("远程仓库修改文件");

    }

}
