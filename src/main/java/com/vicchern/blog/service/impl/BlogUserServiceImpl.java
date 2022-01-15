package com.vicchern.blog.service.impl;

import com.vicchern.blog.model.BlogUser;
import com.vicchern.blog.repository.BlogUserRepository;
import com.vicchern.blog.service.BlogUserService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class BlogUserServiceImpl implements BlogUserService {

    private final BlogUserRepository blogUserRepository;

    @Autowired
    public BlogUserServiceImpl(BlogUserRepository blogUserRepository) {
        this.blogUserRepository = blogUserRepository;
    }

    public List<BlogUser> getAllUsers(){
        List <BlogUser> userList = blogUserRepository.findAll();

        return userList;
    }
}
