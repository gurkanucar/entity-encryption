package com.gucardev.financebe.model.card;

import jakarta.persistence.Entity;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class VirtualCard extends Card {

  private BigDecimal limit;
  private boolean enabled;
}
