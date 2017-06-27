package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="help_keyword"
    ,catalog="mysql"
    , uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class HelpKeyword  implements java.io.Serializable {


     private int helpKeywordId;
     private String name;

    public HelpKeyword() {
    }

    public HelpKeyword(int helpKeywordId, String name) {
       this.helpKeywordId = helpKeywordId;
       this.name = name;
    }
   
     @Id 

    
    @Column(name="help_keyword_id", unique=true, nullable=false)
    public int getHelpKeywordId() {
        return this.helpKeywordId;
    }
    
    public void setHelpKeywordId(int helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }

    
    @Column(name="name", unique=true, nullable=false, length=64)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


