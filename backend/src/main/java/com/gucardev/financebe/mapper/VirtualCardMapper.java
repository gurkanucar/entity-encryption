package com.gucardev.financebe.mapper;

import com.gucardev.financebe.dto.VirtualCardDto;
import com.gucardev.financebe.model.card.VirtualCard;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VirtualCardMapper extends CardMapper {

  VirtualCardMapper INSTANCE = Mappers.getMapper(VirtualCardMapper.class);

  VirtualCardDto toDto(VirtualCard entity);

  VirtualCard toEntity(VirtualCardDto dto);
}
