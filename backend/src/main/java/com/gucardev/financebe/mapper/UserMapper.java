package com.gucardev.financebe.mapper;

import com.gucardev.financebe.dto.UserDto;
import com.gucardev.financebe.model.Account;
import com.gucardev.financebe.model.User;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  default List<UUID> map(List<Account> accounts) {
    return accounts.stream().map(Account::getId).collect(Collectors.toList());
  }

  UserDto toDto(User entity);

  User toEntity(UserDto dto);
}
