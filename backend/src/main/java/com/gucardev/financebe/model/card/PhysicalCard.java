package com.gucardev.financebe.model.card;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class PhysicalCard extends Card {

  private boolean contactlessPaymentEnabled;
}
