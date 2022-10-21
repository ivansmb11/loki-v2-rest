package com.loki.lokiv2.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.loki.lokiv2.model.Client;


@Repository
public interface ClientRepository extends PagingAndSortingRepository<Client, UUID> {
  List<Client> findAll();
  Optional<Client> findByEmail(String email);
  Optional<Client> findById(UUID id);
}
