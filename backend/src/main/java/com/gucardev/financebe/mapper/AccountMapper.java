package com.gucardev.financebe.mapper;

import com.gucardev.financebe.dto.AccountDto;
import com.gucardev.financebe.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

  AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

  @Mapping(source = "user.id", target = "userId")
  AccountDto toDto(Account entity);

  @Mapping(source = "userId", target = "user.id")
  Account toEntity(AccountDto dto);
}
