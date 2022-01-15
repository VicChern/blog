package com.vicchern.blog.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class BlogImage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long image_id;

    private String sourceImageLink;

}
