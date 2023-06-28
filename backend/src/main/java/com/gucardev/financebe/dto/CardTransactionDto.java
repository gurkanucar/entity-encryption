package com.gucardev.financebe.dto;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardTransactionDto {
  private UUID id;
  private UUID cardId;
}
