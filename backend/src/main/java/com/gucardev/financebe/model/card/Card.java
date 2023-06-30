package com.gucardev.financebe.model.card;

import com.gucardev.financebe.model.Account;
import com.gucardev.financebe.model.BaseEntity;
import com.gucardev.financebe.model.User;
import com.gucardev.financebe.model.transaction.CardTransaction;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "account_id", nullable = false)
  private Account account;

  @OneToMany(mappedBy = "card")
  private List<CardTransaction> cardTransactions;

  @ElementCollection(fetch = FetchType.EAGER)
  @MapKeyColumn(name = "name")
  @Column(name = "value")
  @CollectionTable(name = "card_attributes", joinColumns = @JoinColumn(name = "card_id"))
  private Map<String, String> cardAttributes = new HashMap<>();
}
