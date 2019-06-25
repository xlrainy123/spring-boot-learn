package com.xlrainy.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("my_user")
public class User {
    @Value("1")
    private Integer id;
    @Value("zhangsy")
    private String name;
    @Value("19")
    private Integer age;
    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public User(Integer id, String name, Integer age){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "name:"+name+", age:"+age;
    }

}
