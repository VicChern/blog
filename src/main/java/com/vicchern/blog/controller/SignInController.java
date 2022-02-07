package com.vicchern.blog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sign/in")
public class SignInController extends DefaultController {

    @PostMapping()
    public void logUser(){

    }
}
