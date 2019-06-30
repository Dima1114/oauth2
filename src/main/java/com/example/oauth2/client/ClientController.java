package com.example.oauth2.client;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/client")
    @PreAuthorize("#oauth2.hasScope('oauth_admin')")
    public String getClient() {
        return "test client";
    }
}
