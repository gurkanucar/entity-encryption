package com.gucardev.financebe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
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
  @Email(message = "Email should be valid")
  private String email;

  @Column(name = "identityNumber", length = 11)
  @Pattern(regexp = "\\d{11}", message = "Identity number should be 11 digits")
  private String identityNumber;

  @Column(name = "phone", length = 20)
  @Pattern(regexp = "\\d{10,20}", message = "Phone number should be between 10 and 20 digits")
  private String phone;

  @Column(name = "address", length = 100)
  @Size(max = 100, message = "Address should not exceed 100 characters")
  private String address;

  @Column(name = "dateOfBirth")
  @Past(message = "Date of birth should be in the past")
  private LocalDate dateOfBirth;

  @OneToMany(mappedBy = "user")
  private List<Account> accounts;
}
