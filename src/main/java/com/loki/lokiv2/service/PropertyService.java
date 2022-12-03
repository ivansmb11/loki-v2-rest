package com.loki.lokiv2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.loki.lokiv2.model.Property;
import com.loki.lokiv2.model.dto.PropertyDto;
import com.loki.lokiv2.repository.PropertyRepository;

@Service
public class PropertyService {
  
  private final PropertyRepository propertyRepository;

  public PropertyService(PropertyRepository propertyRepository) {
    this.propertyRepository = propertyRepository;
  }

  public List<Property> getAllProperties(String owner) {
    var properties = propertyRepository.findByOwnerId(owner);
    if (properties.isEmpty()) {
      throw new RuntimeException("No properties found for this user.");
    }
    return properties;
  }

}
