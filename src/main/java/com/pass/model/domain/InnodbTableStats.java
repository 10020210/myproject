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
@Table(name="innodb_table_stats"
    ,catalog="mysql"
)
public class InnodbTableStats  implements java.io.Serializable {


     private InnodbTableStatsId id;
     private Date lastUpdate;
     private long NRows;
     private long clusteredIndexSize;
     private long sumOfOtherIndexSizes;

    public InnodbTableStats() {
    }

    public InnodbTableStats(InnodbTableStatsId id, Date lastUpdate, long NRows, long clusteredIndexSize, long sumOfOtherIndexSizes) {
       this.id = id;
       this.lastUpdate = lastUpdate;
       this.NRows = NRows;
       this.clusteredIndexSize = clusteredIndexSize;
       this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="databaseName", column=@Column(name="database_name", nullable=false, length=64) ), 
        @AttributeOverride(name="tableName", column=@Column(name="table_name", nullable=false, length=64) ) } )
    public InnodbTableStatsId getId() {
        return this.id;
    }
    
    public void setId(InnodbTableStatsId id) {
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

    
    @Column(name="n_rows", nullable=false)
    public long getNRows() {
        return this.NRows;
    }
    
    public void setNRows(long NRows) {
        this.NRows = NRows;
    }

    
    @Column(name="clustered_index_size", nullable=false)
    public long getClusteredIndexSize() {
        return this.clusteredIndexSize;
    }
    
    public void setClusteredIndexSize(long clusteredIndexSize) {
        this.clusteredIndexSize = clusteredIndexSize;
    }

    
    @Column(name="sum_of_other_index_sizes", nullable=false)
    public long getSumOfOtherIndexSizes() {
        return this.sumOfOtherIndexSizes;
    }
    
    public void setSumOfOtherIndexSizes(long sumOfOtherIndexSizes) {
        this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
    }




}


