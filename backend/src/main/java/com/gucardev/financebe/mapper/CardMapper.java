package com.gucardev.financebe.mapper;

import com.gucardev.financebe.dto.CardDto;
import com.gucardev.financebe.model.card.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardMapper {

  CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);

  @Mapping(source = "user.id", target = "userId")
  @Mapping(source = "account.id", target = "accountId")
  @Mapping(source = "cardAttributes", target = "cardAttributes")
  CardDto toDto(Card entity);

  @Mapping(source = "userId", target = "user.id")
  @Mapping(source = "accountId", target = "account.id")
  @Mapping(source = "cardAttributes", target = "cardAttributes")
  Card toEntity(CardDto dto);
}
