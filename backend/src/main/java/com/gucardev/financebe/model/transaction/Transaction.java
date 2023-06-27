package com.gucardev.financebe.model.transaction;

import com.gucardev.financebe.model.Account;
import com.gucardev.financebe.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
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
@Inheritance(strategy = InheritanceType.JOINED)
public class Transaction extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "account_id", nullable = false)
  private Account account;

  private BigDecimal amount;

  private String description;

  private String seller;
}
