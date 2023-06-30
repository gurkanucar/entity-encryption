package com.gucardev.financebe.mapper;

import com.gucardev.financebe.dto.BaseEntityDto;
import com.gucardev.financebe.model.BaseEntity;
import java.util.UUID;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BaseEntityMapper {

  BaseEntityMapper INSTANCE = Mappers.getMapper(BaseEntityMapper.class);

  default String map(UUID value) {
    return value != null ? value.toString() : null;
  }

  default UUID map(String value) {
    return value != null ? UUID.fromString(value) : null;
  }

  BaseEntityDto toDto(BaseEntity entity);

  BaseEntity toEntity(BaseEntityDto dto);
}
