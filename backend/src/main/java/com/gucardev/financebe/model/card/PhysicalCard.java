package com.gucardev.financebe.model.card;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "card_id")
public class PhysicalCard extends Card {

  private boolean contactlessPaymentEnabled;
}
