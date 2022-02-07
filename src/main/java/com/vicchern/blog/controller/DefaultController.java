package com.vicchern.blog.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DefaultController implements ErrorController {

    @RequestMapping("/error")
    public String proceedError(){
        return "";
    }

}
