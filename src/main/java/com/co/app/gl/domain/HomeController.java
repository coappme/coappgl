package com.co.app.gl.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
@Controller
public class HomeController {
    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    private String showHome() {
        return "home";
    }
}
