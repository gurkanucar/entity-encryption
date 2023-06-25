package com.gucardev.financebe.model.card;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "card_id")
public class VirtualCard extends Card {

  private BigDecimal limit;
  private boolean enabled;
}
