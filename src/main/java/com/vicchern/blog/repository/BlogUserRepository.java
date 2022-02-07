package com.vicchern.blog.repository;

import com.vicchern.blog.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BlogUserRepository extends JpaRepository<BlogUser,Long> {
}
