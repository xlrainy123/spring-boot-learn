package com.xlrainy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/web")
    public String index(Model map){
        map.addAttribute("title","chaper1");
        map.addAttribute("name","zhangsy");
        return "index";
    }
}
