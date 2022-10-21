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
@Table(name="clients")
public class Client extends AbstractModificationAttributesEntity{
  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="email")
  private String email;

  @Column(name="mobile_phone")
  private String mobilePhone;

  @Column(name="home_phone")
  private String homePhone;

  @Column(name="address")
  private String address;

  @Column(name="city")
  private String city;

  @Column(name="state")
  private String state;

  @Column(name="zip")
  private String zip;

  @Column(name="country")
  private String country;

}
