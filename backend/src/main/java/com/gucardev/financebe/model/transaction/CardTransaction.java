package com.gucardev.financebe.model.transaction;

import com.gucardev.financebe.model.BaseEntity;
import com.gucardev.financebe.model.card.Card;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "transaction_id")
public class CardTransaction extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "card_id", nullable = false)
  private Card card;
}
