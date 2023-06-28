package com.gucardev.financebe.dto;

import com.gucardev.financebe.enumeration.CurrencyType;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {
  private UUID id;
  private String accountNumber;
  private String accountName;
  private BigDecimal balance;
  private String IBAN;
  private CurrencyType currencyType;
  private UUID userId;
}
