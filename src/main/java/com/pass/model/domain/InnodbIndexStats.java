package com.pass.model.domain;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="innodb_index_stats"
    ,catalog="mysql"
)
public class InnodbIndexStats  implements java.io.Serializable {


     private InnodbIndexStatsId id;
     private Date lastUpdate;
     private long statValue;
     private Long sampleSize;
     private String statDescription;

    public InnodbIndexStats() {
    }

	
    public InnodbIndexStats(InnodbIndexStatsId id, Date lastUpdate, long statValue, String statDescription) {
        this.id = id;
        this.lastUpdate = lastUpdate;
        this.statValue = statValue;
        this.statDescription = statDescription;
    }
    public InnodbIndexStats(InnodbIndexStatsId id, Date lastUpdate, long statValue, Long sampleSize, String statDescription) {
       this.id = id;
       this.lastUpdate = lastUpdate;
       this.statValue = statValue;
       this.sampleSize = sampleSize;
       this.statDescription = statDescription;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="databaseName", column=@Column(name="database_name", nullable=false, length=64) ), 
        @AttributeOverride(name="tableName", column=@Column(name="table_name", nullable=false, length=64) ), 
        @AttributeOverride(name="indexName", column=@Column(name="index_name", nullable=false, length=64) ), 
        @AttributeOverride(name="statName", column=@Column(name="stat_name", nullable=false, length=64) ) } )
    public InnodbIndexStatsId getId() {
        return this.id;
    }
    
    public void setId(InnodbIndexStatsId id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false, length=19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
    @Column(name="stat_value", nullable=false)
    public long getStatValue() {
        return this.statValue;
    }
    
    public void setStatValue(long statValue) {
        this.statValue = statValue;
    }

    
    @Column(name="sample_size")
    public Long getSampleSize() {
        return this.sampleSize;
    }
    
    public void setSampleSize(Long sampleSize) {
        this.sampleSize = sampleSize;
    }

    
    @Column(name="stat_description", nullable=false, length=1024)
    public String getStatDescription() {
        return this.statDescription;
    }
    
    public void setStatDescription(String statDescription) {
        this.statDescription = statDescription;
    }




}


