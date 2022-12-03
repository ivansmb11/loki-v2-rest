package com.loki.lokiv2.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Project extends AbstractModificationAttributesEntity {
  @Column(name="client_id")
  private UUID clientId;

  @Column(name="project_name")
  private String projectName;

  @Column(name="project_description")
  private String projectDescription;

  @Column(name="project_status")
  private String projectStatus;
}
