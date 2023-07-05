package com.gucardev.entityencryption.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EncryptionUtilTest {

  @Value("${encryption.key}")
  private String key;

  @Value("${encryption.algorithm}")
  private String algo;

  private EncryptionUtil encryptionUtil;

  @BeforeEach
  void setup() {
    encryptionUtil = new EncryptionUtil(key, algo);
  }

  @Test
  void testEncryptDecrypt() {
    String testValue = "Hello, World!";
    String encryptedValue = encryptionUtil.encrypt(testValue);
    String decryptedValue = encryptionUtil.decrypt(encryptedValue);

    Assertions.assertEquals(testValue, decryptedValue);
  }

  @Test
  void testEncryptDecryptWithEmptyValue() {
    String encryptedValue = encryptionUtil.encrypt("");
    String decryptedValue = encryptionUtil.decrypt(encryptedValue);

    Assertions.assertEquals("", decryptedValue);
  }

  @Test
  void testEncryptDecryptWithNullValue() {
    String encryptedValue = encryptionUtil.encrypt(null);
    String decryptedValue = encryptionUtil.decrypt(encryptedValue);

    Assertions.assertNull(decryptedValue);
  }

  @Test
  void testDecryptWithInvalidEncryptedValue() {
    String decryptedValue = encryptionUtil.decrypt("invalid_encrypted_value");

    Assertions.assertNull(decryptedValue);
  }
}
