/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package top.itcat.rpc.service.model;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum MedicineUsageEnum implements org.apache.thrift.TEnum {
  MedicineUsageEnum_Take(0),
  MedicineUsageEnum_Drip(1),
  MedicineUsageEnum_Injection(2);

  private final int value;

  private MedicineUsageEnum(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MedicineUsageEnum findByValue(int value) { 
    switch (value) {
      case 0:
        return MedicineUsageEnum_Take;
      case 1:
        return MedicineUsageEnum_Drip;
      case 2:
        return MedicineUsageEnum_Injection;
      default:
        return null;
    }
  }
}