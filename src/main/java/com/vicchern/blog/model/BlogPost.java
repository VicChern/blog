package com.vicchern.blog.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table
@Data
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long blogId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private BlogUser blogUser;

    @NotNull
    private String title;

    @NotNull
    private String blogType;

    @NotNull
    private String linkToBlogContentFile;

    @OneToMany
    @JoinColumn(name = "image_id")
    @NotNull
    private List<BlogImage> blogImage;

    private String description;

    private Timestamp dateOfPublication;

    private String tag;

    private String timeToRead;

}
