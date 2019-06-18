package com.example.oauth2.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientDetailsRepository extends JpaRepository<ClientDetails, String> {
}
