package com.xlrainy.bootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import java.sql.Driver;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

//@SpringBootApplication
@ComponentScan("com.xlrainy")
@EnableAutoConfiguration
@Configuration
@MapperScan("com.xlrainy.domain")
public class MyApplication {

    public static void main(String[] args){

        SpringApplication application = new SpringApplication(MyApplication.class);

        /**
         * ConfigurableEnvironment示例代码部分
         */
        ConfigurableEnvironment environment = new StandardEnvironment();

        MutablePropertySources propertySources = environment.getPropertySources();
        Map<String, Object> myMap = new HashMap<>();
        myMap.put("xlcheng", "zhangsy");
        propertySources.addFirst(new MapPropertySource("MY_P", myMap));


        application.run(args);
        System.err.println("启动完成");
        System.err.println(propertySources.get("MY_P"));

    }
}
