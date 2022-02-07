package com.vicchern.blog.dto;

import com.vicchern.blog.model.utils.UserRole;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

public class BlogUserDTO {
    
    private Long user_id;

    private String userName;

    private String firstName;

    private String lastName;
    @Enumerated(EnumType.STRING)
    private UserRole blogUserRole;

    private String userEmail;

    private String userPassword;

    private LocalDate birthDate;

    private String phoneNumber;
}
