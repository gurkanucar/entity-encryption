package com.gucardev.entityencryption.config;

import com.gucardev.entityencryption.service.EncryptionUtil;
import jakarta.persistence.AttributeConverter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Encrypt implements AttributeConverter<String, String> {

  private final EncryptionUtil encryptionUtil;

  public Encrypt(EncryptionUtil encryptionUtil) {
    this.encryptionUtil = encryptionUtil;
  }

  @Override
  public String convertToDatabaseColumn(String s) {
    return encryptionUtil.encrypt(s);
  }

  @Override
  public String convertToEntityAttribute(String s) {
    return encryptionUtil.decrypt(s);
  }
}
