package com.gucardev.financebe.mapper;

import com.gucardev.financebe.dto.PhysicalCardDto;
import com.gucardev.financebe.model.card.PhysicalCard;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhysicalCardMapper extends CardMapper {

  PhysicalCardMapper INSTANCE = Mappers.getMapper(PhysicalCardMapper.class);

  PhysicalCardDto toDto(PhysicalCard entity);

  PhysicalCard toEntity(PhysicalCardDto dto);
}
