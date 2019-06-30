package com.example.oauth2.entity;

import com.starter.user.entity.Role;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private final static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    private String username;
    private String password;
    private String email;
    @Column(name = "is_enabled")
    private boolean isEnabled = false;
    @Column(name = "refresh_token")
    private String refreshToken;

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "User_Role", joinColumns = @JoinColumn(name = "Usr_Id"))
    private Set<Role> roles;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = encoder.encode(password);
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public User setEnabled(boolean enabled) {
        isEnabled = enabled;
        return this;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public User setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public User setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
}
