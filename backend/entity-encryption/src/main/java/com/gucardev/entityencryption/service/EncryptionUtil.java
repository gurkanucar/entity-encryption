package com.gucardev.entityencryption.service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Component;

@Component
public class EncryptionUtil {
  private String key = "A3Hd$G6!sWSecret";
  private String algo = "AES/ECB/PKCS5PADDING";

  public String encrypt(String value) {
    try {
      SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");

      Cipher cipher = Cipher.getInstance(algo);
      cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

      byte[] encrypted = cipher.doFinal(value.getBytes());
      return Base64.getEncoder().encodeToString(encrypted);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  public String decrypt(String encrypted) {
    try {
      SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");

      Cipher cipher = Cipher.getInstance(algo);
      cipher.init(Cipher.DECRYPT_MODE, skeySpec);

      byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));
      return new String(original);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }
}
