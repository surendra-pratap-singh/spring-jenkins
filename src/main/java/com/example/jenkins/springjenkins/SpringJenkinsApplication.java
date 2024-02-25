package com.example.jenkins.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @PostConstruct
    public void init() {
        logger.info("init method, Application Started!!");
    }

    public static void main(String[] args) {
        logger.info("Application started!! ");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
