package com.xlrainy.controller;

import com.xlrainy.SpringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
public class BeansController {

    @RequestMapping("/list")
    public Object getBeanByName(@RequestParam(value = "name", defaultValue="helloController") String name){
        return SpringUtils.getBean(name);
    }

}
