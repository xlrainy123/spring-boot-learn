package com.xlrainy.listeners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class CustomRunListener implements SpringApplicationRunListener {

    public CustomRunListener(SpringApplication application, String[] args){
        System.err.println("CustomRunListener已经构造完成。"+","+System.currentTimeMillis());
    }

    @Override
    public void starting(){
        System.err.println("starting"+","+System.currentTimeMillis());
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.err.println("environmentPrepared"+","+System.currentTimeMillis());
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.err.println("contextPrepared"+","+System.currentTimeMillis());
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.err.println("contextLoaded"+","+System.currentTimeMillis());
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.err.println("started"+","+System.currentTimeMillis());
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.err.println("running"+","+System.currentTimeMillis());
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.err.println("failed"+","+System.currentTimeMillis());
    }


}
