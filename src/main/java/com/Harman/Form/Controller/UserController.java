package com.Harman.Form.Controller;

import com.Harman.Form.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

    @Controller
    public class UserController {
        @RequestMapping("/")
        public String index() {
            return "index";
        }

        @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
        public ModelAndView save(@ModelAttribute User user) {
            System.out.println("User from UI = " + user);
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("user_information");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
