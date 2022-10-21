package com.loki.lokiv2.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientDto {
  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String mobilePhone;
  private String homePhone;
  private String address;
  private String city;
  private String state;
  private String zip;
  private String country;
}