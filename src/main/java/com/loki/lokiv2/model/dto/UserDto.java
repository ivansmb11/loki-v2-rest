package com.loki.lokiv2.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String role;
  private boolean active;
  private String phone;
}
