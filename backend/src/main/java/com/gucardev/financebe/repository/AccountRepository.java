package com.gucardev.financebe.repository;

import com.gucardev.financebe.model.Account;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, UUID> {}
