package com.gucardev.entityencryption.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address extends BaseEntity {

  private String street;
  private String city;
  private String country;

  @JsonBackReference
  @ManyToOne(fetch = FetchType.LAZY)
  private User user;
}
