package com.xlrainy.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.xlrainy.utils.Utils;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@RestController
public class HelloController{

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name",defaultValue = "world") String name) {
        return "hello" + "," + name+"!";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(HttpServletRequest request){
        System.out.println("-----------------------\n");
        return "welcome1111!";
    }
    /**
     * 参考资料： https://segmentfault.com/a/1190000003914228
     * @param str
     * @return
     */
    @RequestMapping("/test")
    String palindromic(@RequestParam(value = "str", defaultValue = "") String str) {
        Utils utils = new Utils();
        return utils.longestPalindrome(str);
    }
    @RequestMapping("/test/{name}")
    String variable(@PathVariable String name){
        return name;
    }


    public String toString(){
        return "hello controller " + this.hashCode();
    }

}
