package com.vicchern.blog.service;

import com.vicchern.blog.model.BlogUser;
import com.vicchern.blog.model.utils.UserRole;
import com.vicchern.blog.repository.BlogUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;

@Service
public class BlogUserAuthenticationService implements UserDetails {

    private final BlogUserRepository blogUserRepository;

    private BlogUser blogUser;
    
    private Long userID;
    private UserRole blogUserRole;

    @Autowired
    public BlogUserAuthenticationService(BlogUserRepository blogUserRepository) {
        this.blogUserRepository = blogUserRepository;

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(blogUserRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return blogUserRepository.getById(userID).getPassword();
    }

    @Override
    public String getUsername() {
        return blogUserRepository.getById(userID).getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
