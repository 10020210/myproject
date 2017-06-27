package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="time_zone_name"
    ,catalog="mysql"
)
public class TimeZoneName  implements java.io.Serializable {


     private String name;
     private int timeZoneId;

    public TimeZoneName() {
    }

    public TimeZoneName(String name, int timeZoneId) {
       this.name = name;
       this.timeZoneId = timeZoneId;
    }
   
     @Id 

    
    @Column(name="Name", unique=true, nullable=false, length=64)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Time_zone_id", nullable=false)
    public int getTimeZoneId() {
        return this.timeZoneId;
    }
    
    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }




}


