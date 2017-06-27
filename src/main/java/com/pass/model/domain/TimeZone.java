package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="time_zone"
    ,catalog="mysql"
)
public class TimeZone  implements java.io.Serializable {


     private Integer timeZoneId;
     private String useLeapSeconds;

    public TimeZone() {
    }

    public TimeZone(String useLeapSeconds) {
       this.useLeapSeconds = useLeapSeconds;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Time_zone_id", unique=true, nullable=false)
    public Integer getTimeZoneId() {
        return this.timeZoneId;
    }
    
    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    
    @Column(name="Use_leap_seconds", nullable=false, length=2)
    public String getUseLeapSeconds() {
        return this.useLeapSeconds;
    }
    
    public void setUseLeapSeconds(String useLeapSeconds) {
        this.useLeapSeconds = useLeapSeconds;
    }




}


