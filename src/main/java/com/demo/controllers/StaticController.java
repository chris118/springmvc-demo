package com.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticController {

    @RequestMapping(value = "/static_page", method = RequestMethod.GET)
    public String static_page() {
        return "static_page";
    }


    // 静态资源
    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String staticPage() {
        return "redirect:/resources/final.html";
    }


    // 重定向到新的jsp
    @RequestMapping(value = "/redirectPage", method = RequestMethod.GET)
    public String redirectPage() {
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {

        return "final";
    }
}