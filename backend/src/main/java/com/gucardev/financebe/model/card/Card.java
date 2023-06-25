package com.gucardev.financebe.model.card;

import com.gucardev.financebe.model.Account;
import com.gucardev.financebe.model.BaseEntity;
import com.gucardev.financebe.model.User;
import com.gucardev.financebe.model.transaction.CardTransaction;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Card extends BaseEntity {

  private String cardNumber;

  private String cardName;

  @Column(length = 3)
  private Integer CVC;

  private Date validThrough;

  @ManyToOne private User user;

  @JoinColumn(name = "account_id", nullable = false)
  @ManyToOne
  private Account account;

  @OneToMany(mappedBy = "card")
  private List<CardTransaction> cardTransactions;
}
