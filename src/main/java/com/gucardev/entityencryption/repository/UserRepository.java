package com.gucardev.entityencryption.repository;

import com.gucardev.entityencryption.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

  @Query("SELECT DISTINCT u FROM User u LEFT JOIN FETCH u.addresses")
  List<User> findAllWithAddresses();

}
