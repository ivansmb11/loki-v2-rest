package com.loki.lokiv2.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PropertyDto {
  private String id;
  private String name;
  private String propertyType;
  private String description;
  private String address;
  private String city;
  private String state;
  private String zip;
  private String phone;
  private String ownerId;
}
