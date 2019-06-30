package com.example.oauth2.client;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_client_details")
public class ClientDetails {

    private final static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Id
    @Column(name = "client_id")
    private String clientId;

    @Column(name = "resource_ids")
    private String resourceIds;

    @Column(name = "client_secret")
    private String clientSecret;

    @Column(name = "scope")
    private String scope;

    @Column(name = "authorized_grant_types")
    private String authorizedGrantTypes;

    @Column(name = "web_server_redirect_uri")
    private String redirectUti;

    @Column(name = "authorities")
    private String authorities;

    @Column(name = "access_token_validity")
    private Integer accessTokenValidity;

    @Column(name = "refresh_token_validity")
    private Integer refreshTokenValidity;

    @Column(name = "additional_information")
    private String additionalInformation;

    @Column(name = "autoapprove")
    private String autoApprove;

    public String getClientId() {
        return clientId;
    }

    public ClientDetails setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public ClientDetails setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public ClientDetails setClientSecret(String clientSecret) {
        this.clientSecret = encoder.encode(clientSecret);
        return this;
    }

    public String getScope() {
        return scope;
    }

    public ClientDetails setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public ClientDetails setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
        return this;
    }

    public String getRedirectUti() {
        return redirectUti;
    }

    public ClientDetails setRedirectUti(String redirectUti) {
        this.redirectUti = redirectUti;
        return this;
    }

    public String getAuthorities() {
        return authorities;
    }

    public ClientDetails setAuthorities(String authorities) {
        this.authorities = authorities;
        return this;
    }

    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public ClientDetails setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
        return this;
    }

    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public ClientDetails setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public ClientDetails setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    public String getAutoApprove() {
        return autoApprove;
    }

    public ClientDetails setAutoApprove(String autoApprove) {
        this.autoApprove = autoApprove;
        return this;
    }
}
