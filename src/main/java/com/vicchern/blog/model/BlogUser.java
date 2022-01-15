package com.vicchern.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)


    private Long user_id;

    private String userName;

    private String firstName;

    private String lastName;

    private String userEmail;

    private String userPassword;

    private LocalDate birthDate;

    private String phoneNumber;



}
