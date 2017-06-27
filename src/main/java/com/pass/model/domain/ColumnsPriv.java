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
import javax.persistence.Version;


@Entity
@Table(name="columns_priv"
    ,catalog="mysql"
)
public class ColumnsPriv  implements java.io.Serializable {


     private ColumnsPrivId id;
     private Date timestamp;
     private String columnPriv;

    public ColumnsPriv() {
    }

    public ColumnsPriv(ColumnsPrivId id, String columnPriv) {
       this.id = id;
       this.columnPriv = columnPriv;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="Host", nullable=false, length=60) ), 
        @AttributeOverride(name="db", column=@Column(name="Db", nullable=false, length=64) ), 
        @AttributeOverride(name="user", column=@Column(name="User", nullable=false, length=32) ), 
        @AttributeOverride(name="tableName", column=@Column(name="Table_name", nullable=false, length=64) ), 
        @AttributeOverride(name="columnName", column=@Column(name="Column_name", nullable=false, length=64) ) } )
    public ColumnsPrivId getId() {
        return this.id;
    }
    
    public void setId(ColumnsPrivId id) {
        this.id = id;
    }

    @Version@Temporal(TemporalType.TIMESTAMP)
    @Column(name="Timestamp", nullable=false, length=19)
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    
    @Column(name="Column_priv", nullable=false, length=31)
    public String getColumnPriv() {
        return this.columnPriv;
    }
    
    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv;
    }




}


