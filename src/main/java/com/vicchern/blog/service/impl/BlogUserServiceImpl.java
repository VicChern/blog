package com.vicchern.blog.service.impl;

import com.vicchern.blog.model.BlogUser;
import com.vicchern.blog.repository.BlogUserRepository;
import com.vicchern.blog.service.BlogUserService;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BlogUserServiceImpl implements BlogUserService {

    private final BlogUserRepository blogUserRepository;

    private static final Logger logger = LoggerFactory.getLogger(BlogUserServiceImpl.class);

    @Autowired
    public BlogUserServiceImpl(BlogUserRepository blogUserRepository) {
        this.blogUserRepository = blogUserRepository;
    }

    public List<BlogUser> getAllUsers(){
        logger.info("Get a user list from the DB");
        List <BlogUser> userList = blogUserRepository.findAll();

        return userList;
    }

    public Optional<BlogUser> getUser(Long id){
        logger.info("Get a specific user from the DB");

        return blogUserRepository.findById(id);
    }

    @Override
    public void addBlogUser(BlogUser blogUser) {

    }
}
