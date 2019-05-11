package controllers;

import Model.Student;
import Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormSampleController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("user", "command", new User());
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")User user, ModelMap model) {

        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("address", user.getAddress());
        model.addAttribute("isReceivePaper", user.getIsReceivePaper());

        return "user_info";
    }
}
