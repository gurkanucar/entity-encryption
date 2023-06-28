package com.gucardev.financebe.dto;

import java.util.List;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
  private UUID id;
  private String name;
  private String surname;
  private String email;
  private String identityNumber;
  private List<UUID> accountIds;
}
