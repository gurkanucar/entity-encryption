package com.gucardev.financebe.model.transaction;

import com.gucardev.financebe.model.BaseEntity;
import com.gucardev.financebe.model.card.Card;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class CardTransaction extends BaseEntity {

  @JoinColumn(name = "card_id", nullable = false)
  @ManyToOne
  private Card card;
}
