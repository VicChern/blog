package com.vicchern.blog.model;

import com.vicchern.blog.model.utils.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table
@Data
@NoArgsConstructor
public class BlogUser implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    private Boolean isNotExpired;

    private Boolean isNotLocked;

    public BlogUser(String userName,
                    String firstName,
                    String lastName,
                    UserRole blogUserRole,
                    String userEmail,
                    String userPassword,
                    LocalDate birthDate,
                    String phoneNumber,
                    Boolean isNotExpired,
                    Boolean isNotLocked
    ) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.blogUserRole = blogUserRole;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.isNotExpired = isNotExpired;
        this.isNotLocked = isNotLocked;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(blogUserRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isNotLocked;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isNotLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
