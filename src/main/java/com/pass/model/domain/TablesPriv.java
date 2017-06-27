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
@Table(name="tables_priv"
    ,catalog="mysql"
)
public class TablesPriv  implements java.io.Serializable {


     private TablesPrivId id;
     private Date timestamp;
     private String grantor;
     private String tablePriv;
     private String columnPriv;

    public TablesPriv() {
    }

    public TablesPriv(TablesPrivId id, String grantor, String tablePriv, String columnPriv) {
       this.id = id;
       this.grantor = grantor;
       this.tablePriv = tablePriv;
       this.columnPriv = columnPriv;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="Host", nullable=false, length=60) ), 
        @AttributeOverride(name="db", column=@Column(name="Db", nullable=false, length=64) ), 
        @AttributeOverride(name="user", column=@Column(name="User", nullable=false, length=32) ), 
        @AttributeOverride(name="tableName", column=@Column(name="Table_name", nullable=false, length=64) ) } )
    public TablesPrivId getId() {
        return this.id;
    }
    
    public void setId(TablesPrivId id) {
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

    
    @Column(name="Grantor", nullable=false, length=93)
    public String getGrantor() {
        return this.grantor;
    }
    
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    
    @Column(name="Table_priv", nullable=false, length=98)
    public String getTablePriv() {
        return this.tablePriv;
    }
    
    public void setTablePriv(String tablePriv) {
        this.tablePriv = tablePriv;
    }

    
    @Column(name="Column_priv", nullable=false, length=31)
    public String getColumnPriv() {
        return this.columnPriv;
    }
    
    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv;
    }




}


