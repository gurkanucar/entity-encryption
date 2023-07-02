package com.gucardev.entityencryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EntityEncryptionApplication {

  public static void main(String[] args) {
    SpringApplication.run(EntityEncryptionApplication.class, args);
  }
}
