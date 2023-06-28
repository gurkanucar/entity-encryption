package com.gucardev.financebe.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhysicalCardDto extends CardDto {
  private boolean contactlessPaymentEnabled;
}
