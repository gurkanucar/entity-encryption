package com.gucardev.financebe.repository;

import com.gucardev.financebe.model.card.Card;
import com.gucardev.financebe.model.card.PhysicalCard;
import com.gucardev.financebe.model.card.VirtualCard;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CardRepository extends JpaRepository<Card, UUID> {

  @Query("SELECT c FROM VirtualCard c")
  List<VirtualCard> findAllVirtualCards();

  @Query("SELECT c FROM PhysicalCard c")
  List<PhysicalCard> findAllPhysicalCards();
}
