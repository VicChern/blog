package com.vicchern.blog.repository;

import com.vicchern.blog.model.BlogImage;
import com.vicchern.blog.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogImageRepository extends JpaRepository<BlogImage,Long> {
}
