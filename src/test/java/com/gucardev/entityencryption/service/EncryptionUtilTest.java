package com.gucardev.entityencryption.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EncryptionUtilTest {

  private final EncryptionUtil encryptionUtil = new EncryptionUtil();
  private final String testValue = "Hello, World!";

  @Test
  void testEncryptDecrypt() {
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
