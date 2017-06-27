/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 *
 *  PL -> to be removed !!!!
 *
 */
package com.scienceminer.nerd.kb.model.avro; 
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LabelSenseList extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LabelSenseList\",\"namespace\":\"com.scienceminer.nerd.kb.model.avro\",\"fields\":[{\"name\":\"senses\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LabelSense\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"docCount\",\"type\":\"int\"},{\"name\":\"occCount\",\"type\":\"int\"},{\"name\":\"fromTitle\",\"type\":\"boolean\"},{\"name\":\"fromRedirect\",\"type\":\"boolean\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense> senses;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public LabelSenseList() {}

  /**
   * All-args constructor.
   */
  public LabelSenseList(java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense> senses) {
    this.senses = senses;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return senses;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: senses = (java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'senses' field.
   */
  public java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense> getSenses() {
    return senses;
  }

  /**
   * Sets the value of the 'senses' field.
   * @param value the value to set.
   */
  public void setSenses(java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense> value) {
    this.senses = value;
  }

  /** Creates a new LabelSenseList RecordBuilder */
  public static com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder newBuilder() {
    return new com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder();
  }
  
  /** Creates a new LabelSenseList RecordBuilder by copying an existing Builder */
  public static com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder newBuilder(com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder other) {
    return new com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder(other);
  }
  
  /** Creates a new LabelSenseList RecordBuilder by copying an existing LabelSenseList instance */
  public static com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder newBuilder(com.scienceminer.nerd.kb.model.avro.LabelSenseList other) {
    return new com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder(other);
  }
  
  /**
   * RecordBuilder for LabelSenseList instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LabelSenseList>
    implements org.apache.avro.data.RecordBuilder<LabelSenseList> {

    private java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense> senses;

    /** Creates a new Builder */
    private Builder() {
      super(com.scienceminer.nerd.kb.model.avro.LabelSenseList.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.senses)) {
        this.senses = data().deepCopy(fields()[0].schema(), other.senses);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LabelSenseList instance */
    private Builder(com.scienceminer.nerd.kb.model.avro.LabelSenseList other) {
            super(com.scienceminer.nerd.kb.model.avro.LabelSenseList.SCHEMA$);
      if (isValidValue(fields()[0], other.senses)) {
        this.senses = data().deepCopy(fields()[0].schema(), other.senses);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'senses' field */
    public java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense> getSenses() {
      return senses;
    }
    
    /** Sets the value of the 'senses' field */
    public com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder setSenses(java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense> value) {
      validate(fields()[0], value);
      this.senses = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'senses' field has been set */
    public boolean hasSenses() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'senses' field */
    public com.scienceminer.nerd.kb.model.avro.LabelSenseList.Builder clearSenses() {
      senses = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public LabelSenseList build() {
      try {
        LabelSenseList record = new LabelSenseList();
        record.senses = fieldSetFlags()[0] ? this.senses : (java.util.List<com.scienceminer.nerd.kb.model.avro.LabelSense>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
