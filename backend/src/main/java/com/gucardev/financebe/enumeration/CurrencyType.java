package com.gucardev.financebe.enumeration;

public enum CurrencyType {
  TRY("Turkish Lira"),
  USD("US Dollar"),
  EUR("Euro"),
  GBP("British Pound"),
  JPY("Japanese Yen"),
  AUD("Australian Dollar"),
  CAD("Canadian Dollar"),
  CHF("Swiss Franc"),
  CNY("Chinese Yuan"),
  SEK("Swedish Krona"),
  INR("Indian Rupee"),
  RUB("Russian Ruble"),
  PLN("Polish Złoty");

  private final String displayName;

  CurrencyType(String displayName) {
    this.displayName = displayName;
  }

  public String getDisplayName() {
    return displayName;
  }

  public static CurrencyType getByString(String name) {
    for (CurrencyType currencyType : values()) {
      if (currencyType.name().equalsIgnoreCase(name)) {
        return currencyType;
      }
    }
    throw new IllegalArgumentException("Invalid CurrencyType: " + name);
  }
}
