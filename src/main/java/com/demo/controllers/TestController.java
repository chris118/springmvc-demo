package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
//    // 返回 index.jsp
//    @RequestMapping("/index")
//    public String helloWord(){
//        System.out.print("access index controller");
//

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String helloWord(ModelMap model) {
        model.addAttribute("name", "Chris");
        return "index";
    }

//    // 返回 ModelAndView
//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public ModelAndView helloWord() {
//        return new ModelAndView("user");
//    }
}