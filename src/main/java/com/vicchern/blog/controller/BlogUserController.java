package com.vicchern.blog.controller;

import com.vicchern.blog.model.BlogUser;
import com.vicchern.blog.service.BlogUserService;
import com.vicchern.blog.util.BlogPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(BlogPath.API_V1 + "/user")
public class BlogUserController {

    private final BlogUserService blogUserService;

    private static final Logger logger = LoggerFactory.getLogger(BlogUserController.class);

    @Autowired
    public BlogUserController(BlogUserService blogUserService) {
        this.blogUserService = blogUserService;
    }

    @GetMapping(BlogPath.ALL_USERS)
    public List<BlogUser> getAllUsers(){
        logger.info("Create requested to get a list of all users");
        return blogUserService.getAllUsers();
    }

    @GetMapping(BlogPath.ALL_USERS + "/{id}")
    public Optional<BlogUser> getUser(@PathVariable Long id){
        logger.info("Client requested to get specific user");
        return blogUserService.getUser(id);
    }


}
