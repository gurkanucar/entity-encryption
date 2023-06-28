package com.gucardev.financebe.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntityDto {

  private String id;

  private LocalDateTime createdDate;

  private LocalDateTime updatedDate;

  private String createdBy;

  private String updatedBy;
}
