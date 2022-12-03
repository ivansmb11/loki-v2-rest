package com.loki.lokiv2.repository;

import java.util.List;
import java.util.UUID;

import com.loki.lokiv2.model.Property;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PropertyRepository extends PagingAndSortingRepository<Property, UUID> {
  List<Property> findByOwnerId(String ownerId);
}
