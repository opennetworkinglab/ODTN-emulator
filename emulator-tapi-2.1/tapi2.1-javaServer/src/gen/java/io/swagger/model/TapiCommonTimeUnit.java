/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.common.TimeUnit
 */
public enum TapiCommonTimeUnit {
  
  YEARS("YEARS"),
  
  MONTHS("MONTHS"),
  
  DAYS("DAYS"),
  
  HOURS("HOURS"),
  
  MINUTES("MINUTES"),
  
  SECONDS("SECONDS"),
  
  MILLISECONDS("MILLISECONDS"),
  
  MICROSECONDS("MICROSECONDS"),
  
  NANOSECONDS("NANOSECONDS"),
  
  PICOSECONDS("PICOSECONDS");

  private String value;

  TapiCommonTimeUnit(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiCommonTimeUnit fromValue(String text) {
    for (TapiCommonTimeUnit b : TapiCommonTimeUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

