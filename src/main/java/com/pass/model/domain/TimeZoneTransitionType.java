package com.pass.model.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="time_zone_transition_type"
    ,catalog="mysql"
)
public class TimeZoneTransitionType  implements java.io.Serializable {


     private TimeZoneTransitionTypeId id;
     private int offset;
     private byte isDst;
     private String abbreviation;

    public TimeZoneTransitionType() {
    }

    public TimeZoneTransitionType(TimeZoneTransitionTypeId id, int offset, byte isDst, String abbreviation) {
       this.id = id;
       this.offset = offset;
       this.isDst = isDst;
       this.abbreviation = abbreviation;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="timeZoneId", column=@Column(name="Time_zone_id", nullable=false) ), 
        @AttributeOverride(name="transitionTypeId", column=@Column(name="Transition_type_id", nullable=false) ) } )
    public TimeZoneTransitionTypeId getId() {
        return this.id;
    }
    
    public void setId(TimeZoneTransitionTypeId id) {
        this.id = id;
    }

    
    @Column(name="Offset", nullable=false)
    public int getOffset() {
        return this.offset;
    }
    
    public void setOffset(int offset) {
        this.offset = offset;
    }

    
    @Column(name="Is_DST", nullable=false)
    public byte getIsDst() {
        return this.isDst;
    }
    
    public void setIsDst(byte isDst) {
        this.isDst = isDst;
    }

    
    @Column(name="Abbreviation", nullable=false, length=8)
    public String getAbbreviation() {
        return this.abbreviation;
    }
    
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }




}


