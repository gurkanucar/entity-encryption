package com.gucardev.entityencryption.repository;

import com.gucardev.entityencryption.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {}
