package com.vicchern.blog.service;

import com.vicchern.blog.model.BlogUser;

import java.util.List;
import java.util.Optional;

public interface BlogUserService {

    List<BlogUser> getAllUsers();

    Optional<BlogUser> getUser(Long userID);

    void addBlogUser(BlogUser blogUser);

}
