package com.xlrainy;

import com.xlrainy.controller.HelloController;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(HelloApplication.class);
        /**
         * 自定义的配置信息
         */
        application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        application.setBannerMode(Banner.Mode.OFF);
        // others

        application.run(args);
        SpringApplication.run(HelloApplication.class, args);
    }
}




