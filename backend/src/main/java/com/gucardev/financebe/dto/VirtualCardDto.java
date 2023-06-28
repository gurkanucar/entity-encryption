package com.gucardev.financebe.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VirtualCardDto extends CardDto {
  private BigDecimal cardLimit;
  private boolean enabled;
}
