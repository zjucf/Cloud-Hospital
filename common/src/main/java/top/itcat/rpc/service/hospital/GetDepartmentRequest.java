/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package top.itcat.rpc.service.hospital;

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
public class GetDepartmentRequest implements org.apache.thrift.TBase<GetDepartmentRequest, GetDepartmentRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetDepartmentRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetDepartmentRequest");

  private static final org.apache.thrift.protocol.TField IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("ids", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CLASSIFICATION_FIELD_DESC = new org.apache.thrift.protocol.TField("classification", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CATALOG_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I32, (short)100);
  private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("limit", org.apache.thrift.protocol.TType.I32, (short)101);
  private static final org.apache.thrift.protocol.TField SEARCH_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("searchKey", org.apache.thrift.protocol.TType.STRING, (short)102);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetDepartmentRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetDepartmentRequestTupleSchemeFactory());
  }

  public List<Long> ids; // optional
  public String code; // optional
  public String name; // optional
  /**
   * 
   * @see top.itcat.rpc.service.model.DepartClassificationEnum
   */
  public top.itcat.rpc.service.model.DepartClassificationEnum classification; // optional
  public String catalog; // optional
  public int offset; // optional
  public int limit; // optional
  public String searchKey; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IDS((short)1, "ids"),
    CODE((short)2, "code"),
    NAME((short)3, "name"),
    /**
     * 
     * @see top.itcat.rpc.service.model.DepartClassificationEnum
     */
    CLASSIFICATION((short)4, "classification"),
    CATALOG((short)5, "catalog"),
    OFFSET((short)100, "offset"),
    LIMIT((short)101, "limit"),
    SEARCH_KEY((short)102, "searchKey");

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
        case 1: // IDS
          return IDS;
        case 2: // CODE
          return CODE;
        case 3: // NAME
          return NAME;
        case 4: // CLASSIFICATION
          return CLASSIFICATION;
        case 5: // CATALOG
          return CATALOG;
        case 100: // OFFSET
          return OFFSET;
        case 101: // LIMIT
          return LIMIT;
        case 102: // SEARCH_KEY
          return SEARCH_KEY;
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
  private static final int __OFFSET_ISSET_ID = 0;
  private static final int __LIMIT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IDS,_Fields.CODE,_Fields.NAME,_Fields.CLASSIFICATION,_Fields.CATALOG,_Fields.OFFSET,_Fields.LIMIT,_Fields.SEARCH_KEY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IDS, new org.apache.thrift.meta_data.FieldMetaData("ids", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLASSIFICATION, new org.apache.thrift.meta_data.FieldMetaData("classification", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, top.itcat.rpc.service.model.DepartClassificationEnum.class)));
    tmpMap.put(_Fields.CATALOG, new org.apache.thrift.meta_data.FieldMetaData("catalog", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LIMIT, new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SEARCH_KEY, new org.apache.thrift.meta_data.FieldMetaData("searchKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetDepartmentRequest.class, metaDataMap);
  }

  public GetDepartmentRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetDepartmentRequest(GetDepartmentRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetIds()) {
      List<Long> __this__ids = new ArrayList<Long>(other.ids);
      this.ids = __this__ids;
    }
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetClassification()) {
      this.classification = other.classification;
    }
    if (other.isSetCatalog()) {
      this.catalog = other.catalog;
    }
    this.offset = other.offset;
    this.limit = other.limit;
    if (other.isSetSearchKey()) {
      this.searchKey = other.searchKey;
    }
  }

  public GetDepartmentRequest deepCopy() {
    return new GetDepartmentRequest(this);
  }

  @Override
  public void clear() {
    this.ids = null;
    this.code = null;
    this.name = null;
    this.classification = null;
    this.catalog = null;
    setOffsetIsSet(false);
    this.offset = 0;
    setLimitIsSet(false);
    this.limit = 0;
    this.searchKey = null;
  }

  public int getIdsSize() {
    return (this.ids == null) ? 0 : this.ids.size();
  }

  public java.util.Iterator<Long> getIdsIterator() {
    return (this.ids == null) ? null : this.ids.iterator();
  }

  public void addToIds(long elem) {
    if (this.ids == null) {
      this.ids = new ArrayList<Long>();
    }
    this.ids.add(elem);
  }

  public List<Long> getIds() {
    return this.ids;
  }

  public GetDepartmentRequest setIds(List<Long> ids) {
    this.ids = ids;
    return this;
  }

  public void unsetIds() {
    this.ids = null;
  }

  /** Returns true if field ids is set (has been assigned a value) and false otherwise */
  public boolean isSetIds() {
    return this.ids != null;
  }

  public void setIdsIsSet(boolean value) {
    if (!value) {
      this.ids = null;
    }
  }

  public String getCode() {
    return this.code;
  }

  public GetDepartmentRequest setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public GetDepartmentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  /**
   * 
   * @see top.itcat.rpc.service.model.DepartClassificationEnum
   */
  public top.itcat.rpc.service.model.DepartClassificationEnum getClassification() {
    return this.classification;
  }

  /**
   * 
   * @see top.itcat.rpc.service.model.DepartClassificationEnum
   */
  public GetDepartmentRequest setClassification(top.itcat.rpc.service.model.DepartClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

  public void unsetClassification() {
    this.classification = null;
  }

  /** Returns true if field classification is set (has been assigned a value) and false otherwise */
  public boolean isSetClassification() {
    return this.classification != null;
  }

  public void setClassificationIsSet(boolean value) {
    if (!value) {
      this.classification = null;
    }
  }

  public String getCatalog() {
    return this.catalog;
  }

  public GetDepartmentRequest setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public void unsetCatalog() {
    this.catalog = null;
  }

  /** Returns true if field catalog is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog() {
    return this.catalog != null;
  }

  public void setCatalogIsSet(boolean value) {
    if (!value) {
      this.catalog = null;
    }
  }

  public int getOffset() {
    return this.offset;
  }

  public GetDepartmentRequest setOffset(int offset) {
    this.offset = offset;
    setOffsetIsSet(true);
    return this;
  }

  public void unsetOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  public int getLimit() {
    return this.limit;
  }

  public GetDepartmentRequest setLimit(int limit) {
    this.limit = limit;
    setLimitIsSet(true);
    return this;
  }

  public void unsetLimit() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  /** Returns true if field limit is set (has been assigned a value) and false otherwise */
  public boolean isSetLimit() {
    return EncodingUtils.testBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LIMIT_ISSET_ID, value);
  }

  public String getSearchKey() {
    return this.searchKey;
  }

  public GetDepartmentRequest setSearchKey(String searchKey) {
    this.searchKey = searchKey;
    return this;
  }

  public void unsetSearchKey() {
    this.searchKey = null;
  }

  /** Returns true if field searchKey is set (has been assigned a value) and false otherwise */
  public boolean isSetSearchKey() {
    return this.searchKey != null;
  }

  public void setSearchKeyIsSet(boolean value) {
    if (!value) {
      this.searchKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IDS:
      if (value == null) {
        unsetIds();
      } else {
        setIds((List<Long>)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CLASSIFICATION:
      if (value == null) {
        unsetClassification();
      } else {
        setClassification((top.itcat.rpc.service.model.DepartClassificationEnum)value);
      }
      break;

    case CATALOG:
      if (value == null) {
        unsetCatalog();
      } else {
        setCatalog((String)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((Integer)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((Integer)value);
      }
      break;

    case SEARCH_KEY:
      if (value == null) {
        unsetSearchKey();
      } else {
        setSearchKey((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IDS:
      return getIds();

    case CODE:
      return getCode();

    case NAME:
      return getName();

    case CLASSIFICATION:
      return getClassification();

    case CATALOG:
      return getCatalog();

    case OFFSET:
      return Integer.valueOf(getOffset());

    case LIMIT:
      return Integer.valueOf(getLimit());

    case SEARCH_KEY:
      return getSearchKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IDS:
      return isSetIds();
    case CODE:
      return isSetCode();
    case NAME:
      return isSetName();
    case CLASSIFICATION:
      return isSetClassification();
    case CATALOG:
      return isSetCatalog();
    case OFFSET:
      return isSetOffset();
    case LIMIT:
      return isSetLimit();
    case SEARCH_KEY:
      return isSetSearchKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetDepartmentRequest)
      return this.equals((GetDepartmentRequest)that);
    return false;
  }

  public boolean equals(GetDepartmentRequest that) {
    if (that == null)
      return false;

    boolean this_present_ids = true && this.isSetIds();
    boolean that_present_ids = true && that.isSetIds();
    if (this_present_ids || that_present_ids) {
      if (!(this_present_ids && that_present_ids))
        return false;
      if (!this.ids.equals(that.ids))
        return false;
    }

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_classification = true && this.isSetClassification();
    boolean that_present_classification = true && that.isSetClassification();
    if (this_present_classification || that_present_classification) {
      if (!(this_present_classification && that_present_classification))
        return false;
      if (!this.classification.equals(that.classification))
        return false;
    }

    boolean this_present_catalog = true && this.isSetCatalog();
    boolean that_present_catalog = true && that.isSetCatalog();
    if (this_present_catalog || that_present_catalog) {
      if (!(this_present_catalog && that_present_catalog))
        return false;
      if (!this.catalog.equals(that.catalog))
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_limit = true && this.isSetLimit();
    boolean that_present_limit = true && that.isSetLimit();
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
        return false;
    }

    boolean this_present_searchKey = true && this.isSetSearchKey();
    boolean that_present_searchKey = true && that.isSetSearchKey();
    if (this_present_searchKey || that_present_searchKey) {
      if (!(this_present_searchKey && that_present_searchKey))
        return false;
      if (!this.searchKey.equals(that.searchKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ids = true && (isSetIds());
    list.add(present_ids);
    if (present_ids)
      list.add(ids);

    boolean present_code = true && (isSetCode());
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_classification = true && (isSetClassification());
    list.add(present_classification);
    if (present_classification)
      list.add(classification.getValue());

    boolean present_catalog = true && (isSetCatalog());
    list.add(present_catalog);
    if (present_catalog)
      list.add(catalog);

    boolean present_offset = true && (isSetOffset());
    list.add(present_offset);
    if (present_offset)
      list.add(offset);

    boolean present_limit = true && (isSetLimit());
    list.add(present_limit);
    if (present_limit)
      list.add(limit);

    boolean present_searchKey = true && (isSetSearchKey());
    list.add(present_searchKey);
    if (present_searchKey)
      list.add(searchKey);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetDepartmentRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIds()).compareTo(other.isSetIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ids, other.ids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClassification()).compareTo(other.isSetClassification());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClassification()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.classification, other.classification);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCatalog()).compareTo(other.isSetCatalog());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog, other.catalog);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOffset()).compareTo(other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLimit()).compareTo(other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limit, other.limit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSearchKey()).compareTo(other.isSetSearchKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSearchKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.searchKey, other.searchKey);
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
    StringBuilder sb = new StringBuilder("GetDepartmentRequest(");
    boolean first = true;

    if (isSetIds()) {
      sb.append("ids:");
      if (this.ids == null) {
        sb.append("null");
      } else {
        sb.append(this.ids);
      }
      first = false;
    }
    if (isSetCode()) {
      if (!first) sb.append(", ");
      sb.append("code:");
      if (this.code == null) {
        sb.append("null");
      } else {
        sb.append(this.code);
      }
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetClassification()) {
      if (!first) sb.append(", ");
      sb.append("classification:");
      if (this.classification == null) {
        sb.append("null");
      } else {
        sb.append(this.classification);
      }
      first = false;
    }
    if (isSetCatalog()) {
      if (!first) sb.append(", ");
      sb.append("catalog:");
      if (this.catalog == null) {
        sb.append("null");
      } else {
        sb.append(this.catalog);
      }
      first = false;
    }
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
      first = false;
    }
    if (isSetLimit()) {
      if (!first) sb.append(", ");
      sb.append("limit:");
      sb.append(this.limit);
      first = false;
    }
    if (isSetSearchKey()) {
      if (!first) sb.append(", ");
      sb.append("searchKey:");
      if (this.searchKey == null) {
        sb.append("null");
      } else {
        sb.append(this.searchKey);
      }
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

  private static class GetDepartmentRequestStandardSchemeFactory implements SchemeFactory {
    public GetDepartmentRequestStandardScheme getScheme() {
      return new GetDepartmentRequestStandardScheme();
    }
  }

  private static class GetDepartmentRequestStandardScheme extends StandardScheme<GetDepartmentRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetDepartmentRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.ids = new ArrayList<Long>(_list0.size);
                long _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI64();
                  struct.ids.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLASSIFICATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.classification = top.itcat.rpc.service.model.DepartClassificationEnum.findByValue(iprot.readI32());
              struct.setClassificationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CATALOG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalog = iprot.readString();
              struct.setCatalogIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 100: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.offset = iprot.readI32();
              struct.setOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 101: // LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.limit = iprot.readI32();
              struct.setLimitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 102: // SEARCH_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.searchKey = iprot.readString();
              struct.setSearchKeyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetDepartmentRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ids != null) {
        if (struct.isSetIds()) {
          oprot.writeFieldBegin(IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.ids.size()));
            for (long _iter3 : struct.ids)
            {
              oprot.writeI64(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.code != null) {
        if (struct.isSetCode()) {
          oprot.writeFieldBegin(CODE_FIELD_DESC);
          oprot.writeString(struct.code);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.classification != null) {
        if (struct.isSetClassification()) {
          oprot.writeFieldBegin(CLASSIFICATION_FIELD_DESC);
          oprot.writeI32(struct.classification.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.catalog != null) {
        if (struct.isSetCatalog()) {
          oprot.writeFieldBegin(CATALOG_FIELD_DESC);
          oprot.writeString(struct.catalog);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI32(struct.offset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLimit()) {
        oprot.writeFieldBegin(LIMIT_FIELD_DESC);
        oprot.writeI32(struct.limit);
        oprot.writeFieldEnd();
      }
      if (struct.searchKey != null) {
        if (struct.isSetSearchKey()) {
          oprot.writeFieldBegin(SEARCH_KEY_FIELD_DESC);
          oprot.writeString(struct.searchKey);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetDepartmentRequestTupleSchemeFactory implements SchemeFactory {
    public GetDepartmentRequestTupleScheme getScheme() {
      return new GetDepartmentRequestTupleScheme();
    }
  }

  private static class GetDepartmentRequestTupleScheme extends TupleScheme<GetDepartmentRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetDepartmentRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIds()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetClassification()) {
        optionals.set(3);
      }
      if (struct.isSetCatalog()) {
        optionals.set(4);
      }
      if (struct.isSetOffset()) {
        optionals.set(5);
      }
      if (struct.isSetLimit()) {
        optionals.set(6);
      }
      if (struct.isSetSearchKey()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetIds()) {
        {
          oprot.writeI32(struct.ids.size());
          for (long _iter4 : struct.ids)
          {
            oprot.writeI64(_iter4);
          }
        }
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetClassification()) {
        oprot.writeI32(struct.classification.getValue());
      }
      if (struct.isSetCatalog()) {
        oprot.writeString(struct.catalog);
      }
      if (struct.isSetOffset()) {
        oprot.writeI32(struct.offset);
      }
      if (struct.isSetLimit()) {
        oprot.writeI32(struct.limit);
      }
      if (struct.isSetSearchKey()) {
        oprot.writeString(struct.searchKey);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetDepartmentRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.ids = new ArrayList<Long>(_list5.size);
          long _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readI64();
            struct.ids.add(_elem6);
          }
        }
        struct.setIdsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.classification = top.itcat.rpc.service.model.DepartClassificationEnum.findByValue(iprot.readI32());
        struct.setClassificationIsSet(true);
      }
      if (incoming.get(4)) {
        struct.catalog = iprot.readString();
        struct.setCatalogIsSet(true);
      }
      if (incoming.get(5)) {
        struct.offset = iprot.readI32();
        struct.setOffsetIsSet(true);
      }
      if (incoming.get(6)) {
        struct.limit = iprot.readI32();
        struct.setLimitIsSet(true);
      }
      if (incoming.get(7)) {
        struct.searchKey = iprot.readString();
        struct.setSearchKeyIsSet(true);
      }
    }
  }

}

