package com.gucardev.financebe.model.card;

import com.gucardev.financebe.model.BaseEntity;
import com.gucardev.financebe.model.User;
import com.gucardev.financebe.model.transaction.Transaction;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Card extends BaseEntity {

  private String cardNumber;

  private String cardName;

  @Column(length = 3)
  private Integer CVC;

  private Date validThrough;

  @ManyToOne private User user;

  @OneToMany private List<Transaction> cardTransactions;
}
