package com.gucardev.financebe.mapper;

import com.gucardev.financebe.dto.CardTransactionDto;
import com.gucardev.financebe.model.transaction.CardTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardTransactionMapper {

  CardTransactionMapper INSTANCE = Mappers.getMapper(CardTransactionMapper.class);

  @Mapping(source = "card.id", target = "cardId")
  CardTransactionDto toDto(CardTransaction entity);

  @Mapping(source = "cardId", target = "card.id")
  CardTransaction toEntity(CardTransactionDto dto);
}
