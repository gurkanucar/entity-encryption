# Spring Boot JPA Entity Field Encryption


#### resource: [https://medium.com/@deependra.chourasia/encryption-and-decryption-of-data-at-blazing-speed-using-spring-data-jpa-a4c36b84588e](https://medium.com/@deependra.chourasia/encryption-and-decryption-of-data-at-blazing-speed-using-spring-data-jpa-a4c36b84588e)

### Steps

- create a `Encrypt` config class and call your Encryption util class :

```java

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

```

- Annotate ` @Convert(converter = Encrypt.class)` to the fields you want to encrypt

```java

@Entity
@Getter
@Setter
public class Address extends BaseEntity {

  @Convert(converter = Encrypt.class)
  private String street;

  @Convert(converter = Encrypt.class)
  private String city;

  @Convert(converter = Encrypt.class)
  private String country;
  
   .....

}
```

### Final Result

SELECT * FROM ADDRESS;

| ID  |     CREATED_DATE      |   LAST_MODIFIED_DATE   |          CITY          |        COUNTRY        |        STREET        | user_id |
|-----|-----------------------|------------------------|------------------------|-----------------------|----------------------|---------|
| 1   | 2023-07-02 10:34:11.18 | 2023-07-02 10:34:11.18 | hWWj264yrVqNCTqorSyBSw== | 7dFiEmlZK4E76Vp0r0+cZw== | 4F4zBWTNtXN+APR3NeRcUw== |       1 |
| 2   | 2023-07-02 10:48:47.655 | 2023-07-02 10:48:47.655 | fuxyoixiGptS7egS71JlAw== | 7dFiEmlZK4E76Vp0r0+cZw== | Qem4CXeqwSUIS4bslzjhHQ== |       1 |


