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
@Table(name="property")
public class Property extends AbstractModificationAttributesEntity {
  @Column(name="name")
  private String name;

  @Column(name="property_type")
  private String propertyType;

  @Column(name="description")
  private String description;

  @Column(name="address")
  private String address;

  @Column(name="city")
  private String city;

  @Column(name="state")
  private String state;

  @Column(name="zip")
  private String zip;

  @Column(name="phone")
  private String phone;

  @Column(name="owner_id")
  private String ownerId;

}