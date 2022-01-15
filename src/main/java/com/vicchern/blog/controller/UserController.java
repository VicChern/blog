package com.vicchern.blog.controller;

import com.vicchern.blog.model.BlogUser;
import com.vicchern.blog.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController extends DefaultController {

    private final BlogUserService blogUserService;

    @Autowired
    public UserController(BlogUserService blogUserService) {
        this.blogUserService = blogUserService;
    }

    @GetMapping("/allusers")
    public List<BlogUser> getAllUsers(){
        return blogUserService.getAllUsers();
    }
}
