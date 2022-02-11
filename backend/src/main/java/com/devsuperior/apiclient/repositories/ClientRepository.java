package com.devsuperior.apiclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.apiclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
