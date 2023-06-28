package com.gucardev.financebe.dto;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDto {
  private UUID id;
  private UUID accountId;
  private BigDecimal amount;
  private String description;
  private String seller;
}
