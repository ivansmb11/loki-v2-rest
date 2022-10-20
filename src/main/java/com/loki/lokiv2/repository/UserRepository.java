package com.loki.lokiv2.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.loki.lokiv2.model.User;


@Repository
public interface UserRepository extends PagingAndSortingRepository<User, UUID> {
  Optional<User> findByEmail(String email);
  Optional<User> findByEmailAndActiveTrue(String email);
}
