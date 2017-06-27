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
@Table(name="proc"
    ,catalog="mysql"
)
public class Proc  implements java.io.Serializable {


     private ProcId id;
     private String specificName;
     private String language;
     private String sqlDataAccess;
     private String isDeterministic;
     private String securityType;
     private byte[] paramList;
     private byte[] returns;
     private byte[] body;
     private String definer;
     private Date created;
     private Date modified;
     private String sqlMode;
     private String comment;
     private String characterSetClient;
     private String collationConnection;
     private String dbCollation;
     private byte[] bodyUtf8;

    public Proc() {
    }

	
    public Proc(ProcId id, String specificName, String language, String sqlDataAccess, String isDeterministic, String securityType, byte[] paramList, byte[] returns, byte[] body, String definer, Date created, Date modified, String sqlMode, String comment) {
        this.id = id;
        this.specificName = specificName;
        this.language = language;
        this.sqlDataAccess = sqlDataAccess;
        this.isDeterministic = isDeterministic;
        this.securityType = securityType;
        this.paramList = paramList;
        this.returns = returns;
        this.body = body;
        this.definer = definer;
        this.created = created;
        this.modified = modified;
        this.sqlMode = sqlMode;
        this.comment = comment;
    }
    public Proc(ProcId id, String specificName, String language, String sqlDataAccess, String isDeterministic, String securityType, byte[] paramList, byte[] returns, byte[] body, String definer, Date created, Date modified, String sqlMode, String comment, String characterSetClient, String collationConnection, String dbCollation, byte[] bodyUtf8) {
       this.id = id;
       this.specificName = specificName;
       this.language = language;
       this.sqlDataAccess = sqlDataAccess;
       this.isDeterministic = isDeterministic;
       this.securityType = securityType;
       this.paramList = paramList;
       this.returns = returns;
       this.body = body;
       this.definer = definer;
       this.created = created;
       this.modified = modified;
       this.sqlMode = sqlMode;
       this.comment = comment;
       this.characterSetClient = characterSetClient;
       this.collationConnection = collationConnection;
       this.dbCollation = dbCollation;
       this.bodyUtf8 = bodyUtf8;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="db", column=@Column(name="db", nullable=false, length=64) ), 
        @AttributeOverride(name="name", column=@Column(name="name", nullable=false, length=64) ), 
        @AttributeOverride(name="type", column=@Column(name="type", nullable=false, length=9) ) } )
    public ProcId getId() {
        return this.id;
    }
    
    public void setId(ProcId id) {
        this.id = id;
    }

    
    @Column(name="specific_name", nullable=false, length=64)
    public String getSpecificName() {
        return this.specificName;
    }
    
    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    
    @Column(name="language", nullable=false, length=4)
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    
    @Column(name="sql_data_access", nullable=false, length=17)
    public String getSqlDataAccess() {
        return this.sqlDataAccess;
    }
    
    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess;
    }

    
    @Column(name="is_deterministic", nullable=false, length=4)
    public String getIsDeterministic() {
        return this.isDeterministic;
    }
    
    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    
    @Column(name="security_type", nullable=false, length=8)
    public String getSecurityType() {
        return this.securityType;
    }
    
    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    
    @Column(name="param_list", nullable=false)
    public byte[] getParamList() {
        return this.paramList;
    }
    
    public void setParamList(byte[] paramList) {
        this.paramList = paramList;
    }

    
    @Column(name="returns", nullable=false)
    public byte[] getReturns() {
        return this.returns;
    }
    
    public void setReturns(byte[] returns) {
        this.returns = returns;
    }

    
    @Column(name="body", nullable=false)
    public byte[] getBody() {
        return this.body;
    }
    
    public void setBody(byte[] body) {
        this.body = body;
    }

    
    @Column(name="definer", nullable=false, length=93)
    public String getDefiner() {
        return this.definer;
    }
    
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=19)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modified", nullable=false, length=19)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }

    
    @Column(name="sql_mode", nullable=false, length=478)
    public String getSqlMode() {
        return this.sqlMode;
    }
    
    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    
    @Column(name="comment", nullable=false, length=65535)
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    
    @Column(name="character_set_client", length=32)
    public String getCharacterSetClient() {
        return this.characterSetClient;
    }
    
    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    
    @Column(name="collation_connection", length=32)
    public String getCollationConnection() {
        return this.collationConnection;
    }
    
    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    
    @Column(name="db_collation", length=32)
    public String getDbCollation() {
        return this.dbCollation;
    }
    
    public void setDbCollation(String dbCollation) {
        this.dbCollation = dbCollation;
    }

    
    @Column(name="body_utf8")
    public byte[] getBodyUtf8() {
        return this.bodyUtf8;
    }
    
    public void setBodyUtf8(byte[] bodyUtf8) {
        this.bodyUtf8 = bodyUtf8;
    }




}


