package com.gucardev.financebe.model;

import com.gucardev.financebe.enumeration.CurrencyType;
import com.gucardev.financebe.model.card.Card;
import com.gucardev.financebe.model.transaction.Transaction;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Account extends BaseEntity {

  @Column(name = "accountNumber", length = 30)
  private String accountNumber;

  @Column(name = "accountName", length = 30)
  private String accountName;

  @Column(name = "balance", precision = 10, scale = 2)
  private BigDecimal balance;

  private String IBAN;

  @Enumerated(EnumType.STRING)
  private CurrencyType currencyType;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @OneToMany(mappedBy = "account")
  private List<Transaction> transactions;

  @OneToMany(mappedBy = "account")
  private List<Card> cards;
}
