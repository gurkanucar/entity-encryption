package com.gucardev.entityencryption.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAddressRequest {
  private String street;
  private String city;
  private String country;
  private Long userId;
}

