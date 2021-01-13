package com.codegym.demo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
public class JwtResponse {
    private Long userId;
    private String token;
    private String type = "Bearer";
    private String username;
//    private Collection<? extends GrantedAuthority> roles;

//
//    public JwtResponse(String token, String username, Collection<? extends GrantedAuthority> roles) {
//        this.token = token;
//        this.username = username;
//        this.roles = roles;
//    }

    public JwtResponse(String token, String username) {
        this.token = token;
        this.username = username;
//        this.roles = roles;
    }
}
