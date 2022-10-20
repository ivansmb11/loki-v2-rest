package com.loki.lokiv2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="users")
public class User extends AbstractModificationAttributesEntity {
  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="email")
  private String email;

  @Column(name="password")
  private String password;

  @Column(name="role")
  private String role;
  
  @Column(name="active")
  private boolean active;

  @Column(name="phone")
  private String phone;

}
