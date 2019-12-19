/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package top.itcat.rpc.service.user;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-7-3")
public class GetUserIdsRequest implements org.apache.thrift.TBase<GetUserIdsRequest, GetUserIdsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetUserIdsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetUserIdsRequest");

  private static final org.apache.thrift.protocol.TField ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField("roles", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField DEPART_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("departId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetUserIdsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetUserIdsRequestTupleSchemeFactory());
  }

  public List<top.itcat.rpc.service.model.RoleEnum> roles; // optional
  public long departId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROLES((short)1, "roles"),
    DEPART_ID((short)2, "departId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROLES
          return ROLES;
        case 2: // DEPART_ID
          return DEPART_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DEPARTID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ROLES,_Fields.DEPART_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLES, new org.apache.thrift.meta_data.FieldMetaData("roles", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, top.itcat.rpc.service.model.RoleEnum.class))));
    tmpMap.put(_Fields.DEPART_ID, new org.apache.thrift.meta_data.FieldMetaData("departId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetUserIdsRequest.class, metaDataMap);
  }

  public GetUserIdsRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetUserIdsRequest(GetUserIdsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRoles()) {
      List<top.itcat.rpc.service.model.RoleEnum> __this__roles = new ArrayList<top.itcat.rpc.service.model.RoleEnum>(other.roles.size());
      for (top.itcat.rpc.service.model.RoleEnum other_element : other.roles) {
        __this__roles.add(other_element);
      }
      this.roles = __this__roles;
    }
    this.departId = other.departId;
  }

  public GetUserIdsRequest deepCopy() {
    return new GetUserIdsRequest(this);
  }

  @Override
  public void clear() {
    this.roles = null;
    setDepartIdIsSet(false);
    this.departId = 0;
  }

  public int getRolesSize() {
    return (this.roles == null) ? 0 : this.roles.size();
  }

  public java.util.Iterator<top.itcat.rpc.service.model.RoleEnum> getRolesIterator() {
    return (this.roles == null) ? null : this.roles.iterator();
  }

  public void addToRoles(top.itcat.rpc.service.model.RoleEnum elem) {
    if (this.roles == null) {
      this.roles = new ArrayList<top.itcat.rpc.service.model.RoleEnum>();
    }
    this.roles.add(elem);
  }

  public List<top.itcat.rpc.service.model.RoleEnum> getRoles() {
    return this.roles;
  }

  public GetUserIdsRequest setRoles(List<top.itcat.rpc.service.model.RoleEnum> roles) {
    this.roles = roles;
    return this;
  }

  public void unsetRoles() {
    this.roles = null;
  }

  /** Returns true if field roles is set (has been assigned a value) and false otherwise */
  public boolean isSetRoles() {
    return this.roles != null;
  }

  public void setRolesIsSet(boolean value) {
    if (!value) {
      this.roles = null;
    }
  }

  public long getDepartId() {
    return this.departId;
  }

  public GetUserIdsRequest setDepartId(long departId) {
    this.departId = departId;
    setDepartIdIsSet(true);
    return this;
  }

  public void unsetDepartId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEPARTID_ISSET_ID);
  }

  /** Returns true if field departId is set (has been assigned a value) and false otherwise */
  public boolean isSetDepartId() {
    return EncodingUtils.testBit(__isset_bitfield, __DEPARTID_ISSET_ID);
  }

  public void setDepartIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEPARTID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROLES:
      if (value == null) {
        unsetRoles();
      } else {
        setRoles((List<top.itcat.rpc.service.model.RoleEnum>)value);
      }
      break;

    case DEPART_ID:
      if (value == null) {
        unsetDepartId();
      } else {
        setDepartId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLES:
      return getRoles();

    case DEPART_ID:
      return Long.valueOf(getDepartId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROLES:
      return isSetRoles();
    case DEPART_ID:
      return isSetDepartId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetUserIdsRequest)
      return this.equals((GetUserIdsRequest)that);
    return false;
  }

  public boolean equals(GetUserIdsRequest that) {
    if (that == null)
      return false;

    boolean this_present_roles = true && this.isSetRoles();
    boolean that_present_roles = true && that.isSetRoles();
    if (this_present_roles || that_present_roles) {
      if (!(this_present_roles && that_present_roles))
        return false;
      if (!this.roles.equals(that.roles))
        return false;
    }

    boolean this_present_departId = true && this.isSetDepartId();
    boolean that_present_departId = true && that.isSetDepartId();
    if (this_present_departId || that_present_departId) {
      if (!(this_present_departId && that_present_departId))
        return false;
      if (this.departId != that.departId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_roles = true && (isSetRoles());
    list.add(present_roles);
    if (present_roles)
      list.add(roles);

    boolean present_departId = true && (isSetDepartId());
    list.add(present_departId);
    if (present_departId)
      list.add(departId);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetUserIdsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRoles()).compareTo(other.isSetRoles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roles, other.roles);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepartId()).compareTo(other.isSetDepartId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepartId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.departId, other.departId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetUserIdsRequest(");
    boolean first = true;

    if (isSetRoles()) {
      sb.append("roles:");
      if (this.roles == null) {
        sb.append("null");
      } else {
        sb.append(this.roles);
      }
      first = false;
    }
    if (isSetDepartId()) {
      if (!first) sb.append(", ");
      sb.append("departId:");
      sb.append(this.departId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetUserIdsRequestStandardSchemeFactory implements SchemeFactory {
    public GetUserIdsRequestStandardScheme getScheme() {
      return new GetUserIdsRequestStandardScheme();
    }
  }

  private static class GetUserIdsRequestStandardScheme extends StandardScheme<GetUserIdsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetUserIdsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list216 = iprot.readListBegin();
                struct.roles = new ArrayList<top.itcat.rpc.service.model.RoleEnum>(_list216.size);
                top.itcat.rpc.service.model.RoleEnum _elem217;
                for (int _i218 = 0; _i218 < _list216.size; ++_i218)
                {
                  _elem217 = top.itcat.rpc.service.model.RoleEnum.findByValue(iprot.readI32());
                  struct.roles.add(_elem217);
                }
                iprot.readListEnd();
              }
              struct.setRolesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEPART_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.departId = iprot.readI64();
              struct.setDepartIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetUserIdsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.roles != null) {
        if (struct.isSetRoles()) {
          oprot.writeFieldBegin(ROLES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.roles.size()));
            for (top.itcat.rpc.service.model.RoleEnum _iter219 : struct.roles)
            {
              oprot.writeI32(_iter219.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDepartId()) {
        oprot.writeFieldBegin(DEPART_ID_FIELD_DESC);
        oprot.writeI64(struct.departId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetUserIdsRequestTupleSchemeFactory implements SchemeFactory {
    public GetUserIdsRequestTupleScheme getScheme() {
      return new GetUserIdsRequestTupleScheme();
    }
  }

  private static class GetUserIdsRequestTupleScheme extends TupleScheme<GetUserIdsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetUserIdsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRoles()) {
        optionals.set(0);
      }
      if (struct.isSetDepartId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRoles()) {
        {
          oprot.writeI32(struct.roles.size());
          for (top.itcat.rpc.service.model.RoleEnum _iter220 : struct.roles)
          {
            oprot.writeI32(_iter220.getValue());
          }
        }
      }
      if (struct.isSetDepartId()) {
        oprot.writeI64(struct.departId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetUserIdsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list221 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.roles = new ArrayList<top.itcat.rpc.service.model.RoleEnum>(_list221.size);
          top.itcat.rpc.service.model.RoleEnum _elem222;
          for (int _i223 = 0; _i223 < _list221.size; ++_i223)
          {
            _elem222 = top.itcat.rpc.service.model.RoleEnum.findByValue(iprot.readI32());
            struct.roles.add(_elem222);
          }
        }
        struct.setRolesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.departId = iprot.readI64();
        struct.setDepartIdIsSet(true);
      }
    }
  }

}
