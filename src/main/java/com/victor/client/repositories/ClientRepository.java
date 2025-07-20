package com.victor.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
