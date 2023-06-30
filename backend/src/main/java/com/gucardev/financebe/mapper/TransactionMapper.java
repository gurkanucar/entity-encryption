package com.gucardev.financebe.mapper;

import com.gucardev.financebe.dto.TransactionDto;
import com.gucardev.financebe.model.Account;
import com.gucardev.financebe.model.transaction.Transaction;
import java.util.UUID;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {

  TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

  @Mapping(source = "account.id", target = "accountId")
  TransactionDto toDto(Transaction entity);

  @Mapping(source = "accountId", target = "account.id")
  Transaction toEntity(TransactionDto dto);

  default UUID map(Account account) {
    return (account != null) ? account.getId() : null;
  }
}
