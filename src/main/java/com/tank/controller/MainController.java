package com.tank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by TK-Xiong on 2017/2/28.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public String index() {
        return "index";
    }

}