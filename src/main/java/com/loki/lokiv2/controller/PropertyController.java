package com.loki.lokiv2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.loki.lokiv2.model.Property;
import com.loki.lokiv2.model.dto.PropertyDto;
import com.loki.lokiv2.service.PropertyService;

@RestController
@RequestMapping("/property")
public class PropertyController {

  private final PropertyService propertyService;

  public PropertyController(PropertyService propertyService) {
    this.propertyService = propertyService;
  }
  
  @GetMapping()
  public ResponseEntity<List<Property>> getAllClients(@RequestParam String owner) throws ResponseStatusException {
    return new ResponseEntity<>(propertyService.getAllProperties(owner), HttpStatus.OK);
  }

  @PostMapping()
  public ResponseEntity<PropertyDto> createProperty() throws ResponseStatusException {
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
}
