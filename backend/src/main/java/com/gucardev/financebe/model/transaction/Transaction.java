package com.gucardev.financebe.model.transaction;

import com.gucardev.financebe.model.Account;
import com.gucardev.financebe.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Transaction extends BaseEntity {

  @JoinColumn(name = "account_id", nullable = false)
  @ManyToOne
  private Account account;

  private String accountId;

  private BigDecimal amount;

  private String description;

  private String seller;
}
