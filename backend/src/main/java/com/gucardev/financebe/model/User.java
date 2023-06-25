package com.gucardev.financebe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "USERS")
public class User extends BaseEntity {

  @Column(name = "name", length = 30)
  private String name;

  @Column(name = "surname", length = 30)
  private String surname;

  @Column(name = "email", length = 30)
  private String email;

  @Column(name = "identityNumber", length = 11)
  private String identityNumber;

  @OneToMany(mappedBy = "user")
  private List<Account> accounts;
}
