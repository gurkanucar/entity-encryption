package com.gucardev.financebe.enumeration;

public enum RevType {
  ADD("Added"),
  MODIFY("Modified"),
  DELETE("Deleted"),
  UNKNOWN("Unknown");

  private String label;

  RevType(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  public static RevType fromInt(int value) {
    return switch (value) {
      case 0 -> ADD;
      case 1 -> MODIFY;
      case 2 -> DELETE;
      default -> UNKNOWN;
    };
  }
}
