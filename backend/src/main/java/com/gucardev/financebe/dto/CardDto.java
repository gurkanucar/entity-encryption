package com.gucardev.financebe.dto;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardDto {
  private UUID id;
  private String cardNumber;
  private String cardName;
  private Integer CVC;
  private Date validThrough;
  private UUID userId;
  private UUID accountId;
  private Map<String, String> cardAttributes;
}
