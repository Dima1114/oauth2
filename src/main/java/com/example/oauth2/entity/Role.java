package com.example.oauth2.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ROLE_READ,
    ROLE_WRITE
    ;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
