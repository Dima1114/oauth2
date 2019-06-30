package com.example.oauth2.client;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@SuppressWarnings("NullableProblems")
@RepositoryRestResource
public interface ClientDetailsRepository extends JpaRepository<ClientDetails, String> {

    @Override
    @RestResource
    @PreAuthorize("#oauth2.hasScope('oauth_admin')")
    Page<ClientDetails> findAll(Pageable pageable);

    @Override
    @PreAuthorize("#oauth2.hasScope('oauth_admin')")
    @RestResource
    <S extends ClientDetails> S save(S s);

    @Override
    @PreAuthorize("#oauth2.hasScope('oauth_admin')")
    @RestResource
    void delete(ClientDetails clientDetails);
}
