/*
 * API Endpoints
 * Deliver monetary rewards and incentives to employees, customers, survey participants, and more through the Tremendous API. For organizational tasks, like managing your organization and it's members within Tremendous, please see the Tremendous Organizational API.
 *
 * The version of the OpenAPI document: 2
 * Contact: developers@tremendous.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CurrencyCodes
 */
@JsonAdapter(CurrencyCodes.Adapter.class)public enum CurrencyCodes {
  
  USD("USD"),
  
  CAD("CAD"),
  
  EUR("EUR"),
  
  AED("AED"),
  
  AFN("AFN"),
  
  ALL("ALL"),
  
  AMD("AMD"),
  
  ARS("ARS"),
  
  AUD("AUD"),
  
  AZN("AZN"),
  
  BAM("BAM"),
  
  BDT("BDT"),
  
  BGN("BGN"),
  
  BHD("BHD"),
  
  BIF("BIF"),
  
  BND("BND"),
  
  BOB("BOB"),
  
  BRL("BRL"),
  
  BWP("BWP"),
  
  BYR("BYR"),
  
  BZD("BZD"),
  
  CDF("CDF"),
  
  CHF("CHF"),
  
  CLP("CLP"),
  
  CNY("CNY"),
  
  COP("COP"),
  
  CRC("CRC"),
  
  CVE("CVE"),
  
  CZK("CZK"),
  
  DJF("DJF"),
  
  DKK("DKK"),
  
  DOP("DOP"),
  
  DZD("DZD"),
  
  EEK("EEK"),
  
  EGP("EGP"),
  
  ERN("ERN"),
  
  ETB("ETB"),
  
  GBP("GBP"),
  
  GEL("GEL"),
  
  GHS("GHS"),
  
  GNF("GNF"),
  
  GTQ("GTQ"),
  
  HKD("HKD"),
  
  HNL("HNL"),
  
  HRK("HRK"),
  
  HUF("HUF"),
  
  IDR("IDR"),
  
  ILS("ILS"),
  
  INR("INR"),
  
  IQD("IQD"),
  
  IRR("IRR"),
  
  ISK("ISK"),
  
  JMD("JMD"),
  
  JOD("JOD"),
  
  JPY("JPY"),
  
  KES("KES"),
  
  KHR("KHR"),
  
  KRW("KRW"),
  
  KWD("KWD"),
  
  KZT("KZT"),
  
  LBP("LBP"),
  
  LKR("LKR"),
  
  LTL("LTL"),
  
  LVL("LVL"),
  
  MAD("MAD"),
  
  MDL("MDL"),
  
  MGA("MGA"),
  
  MKD("MKD"),
  
  MMK("MMK"),
  
  MOP("MOP"),
  
  MUR("MUR"),
  
  MXN("MXN"),
  
  MYR("MYR"),
  
  MZN("MZN"),
  
  NAD("NAD"),
  
  NGN("NGN"),
  
  NIO("NIO"),
  
  NOK("NOK"),
  
  NPR("NPR"),
  
  NZD("NZD"),
  
  OMR("OMR"),
  
  PAB("PAB"),
  
  PEN("PEN"),
  
  PHP("PHP"),
  
  PKR("PKR"),
  
  PLN("PLN"),
  
  PYG("PYG"),
  
  QAR("QAR"),
  
  RON("RON"),
  
  RSD("RSD"),
  
  RUB("RUB"),
  
  RWF("RWF"),
  
  SAR("SAR"),
  
  SDG("SDG"),
  
  SEK("SEK"),
  
  SGD("SGD"),
  
  SOS("SOS"),
  
  SYP("SYP"),
  
  THB("THB"),
  
  TND("TND"),
  
  TOP("TOP"),
  
  TRY("TRY"),
  
  TTD("TTD"),
  
  TWD("TWD"),
  
  TZS("TZS"),
  
  UAH("UAH"),
  
  UGX("UGX"),
  
  UYU("UYU"),
  
  UZS("UZS"),
  
  VEF("VEF"),
  
  VND("VND"),
  
  XAF("XAF"),
  
  XOF("XOF"),
  
  YER("YER"),
  
  ZAR("ZAR"),
  
  ZMK("ZMK");

  private String value;

  CurrencyCodes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CurrencyCodes fromValue(String value) {
    for (CurrencyCodes b : CurrencyCodes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CurrencyCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final CurrencyCodes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CurrencyCodes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CurrencyCodes.fromValue(value);
    }
  }
}
