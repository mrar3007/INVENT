// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: barcode_format.proto

package de.mintware.barcode_scan;

public final class BarcodeFormatOuterClass {
  private BarcodeFormatOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * Protobuf enum {@code de.mintware.barcode_scan.BarcodeFormat}
   */
  public enum BarcodeFormat
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>unknown = 0;</code>
     */
    unknown(0),
    /**
     * <code>aztec = 1;</code>
     */
    aztec(1),
    /**
     * <code>code39 = 2;</code>
     */
    code39(2),
    /**
     * <code>code93 = 3;</code>
     */
    code93(3),
    /**
     * <code>ean8 = 4;</code>
     */
    ean8(4),
    /**
     * <code>ean13 = 5;</code>
     */
    ean13(5),
    /**
     * <code>code128 = 6;</code>
     */
    code128(6),
    /**
     * <code>dataMatrix = 7;</code>
     */
    dataMatrix(7),
    /**
     * <code>qr = 8;</code>
     */
    qr(8),
    /**
     * <code>interleaved2of5 = 9;</code>
     */
    interleaved2of5(9),
    /**
     * <code>upce = 10;</code>
     */
    upce(10),
    /**
     * <code>pdf417 = 11;</code>
     */
    pdf417(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>unknown = 0;</code>
     */
    public static final int unknown_VALUE = 0;
    /**
     * <code>aztec = 1;</code>
     */
    public static final int aztec_VALUE = 1;
    /**
     * <code>code39 = 2;</code>
     */
    public static final int code39_VALUE = 2;
    /**
     * <code>code93 = 3;</code>
     */
    public static final int code93_VALUE = 3;
    /**
     * <code>ean8 = 4;</code>
     */
    public static final int ean8_VALUE = 4;
    /**
     * <code>ean13 = 5;</code>
     */
    public static final int ean13_VALUE = 5;
    /**
     * <code>code128 = 6;</code>
     */
    public static final int code128_VALUE = 6;
    /**
     * <code>dataMatrix = 7;</code>
     */
    public static final int dataMatrix_VALUE = 7;
    /**
     * <code>qr = 8;</code>
     */
    public static final int qr_VALUE = 8;
    /**
     * <code>interleaved2of5 = 9;</code>
     */
    public static final int interleaved2of5_VALUE = 9;
    /**
     * <code>upce = 10;</code>
     */
    public static final int upce_VALUE = 10;
    /**
     * <code>pdf417 = 11;</code>
     */
    public static final int pdf417_VALUE = 11;


    @java.lang.Override
    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static BarcodeFormat valueOf(int value) {
      return forNumber(value);
    }

    public static BarcodeFormat forNumber(int value) {
      switch (value) {
        case 0: return unknown;
        case 1: return aztec;
        case 2: return code39;
        case 3: return code93;
        case 4: return ean8;
        case 5: return ean13;
        case 6: return code128;
        case 7: return dataMatrix;
        case 8: return qr;
        case 9: return interleaved2of5;
        case 10: return upce;
        case 11: return pdf417;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BarcodeFormat>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BarcodeFormat> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BarcodeFormat>() {
            @java.lang.Override
            public BarcodeFormat findValueByNumber(int number) {
              return BarcodeFormat.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return BarcodeFormatVerifier.INSTANCE;
    }

    private static final class BarcodeFormatVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new BarcodeFormatVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return BarcodeFormat.forNumber(number) != null;
            }
          };

    private final int value;

    private BarcodeFormat(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:de.mintware.barcode_scan.BarcodeFormat)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
