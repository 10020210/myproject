package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="help_category"
    ,catalog="mysql"
    , uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class HelpCategory  implements java.io.Serializable {


     private short helpCategoryId;
     private String name;
     private Short parentCategoryId;
     private String url;

    public HelpCategory() {
    }

	
    public HelpCategory(short helpCategoryId, String name, String url) {
        this.helpCategoryId = helpCategoryId;
        this.name = name;
        this.url = url;
    }
    public HelpCategory(short helpCategoryId, String name, Short parentCategoryId, String url) {
       this.helpCategoryId = helpCategoryId;
       this.name = name;
       this.parentCategoryId = parentCategoryId;
       this.url = url;
    }
   
     @Id 

    
    @Column(name="help_category_id", unique=true, nullable=false)
    public short getHelpCategoryId() {
        return this.helpCategoryId;
    }
    
    public void setHelpCategoryId(short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    
    @Column(name="name", unique=true, nullable=false, length=64)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="parent_category_id")
    public Short getParentCategoryId() {
        return this.parentCategoryId;
    }
    
    public void setParentCategoryId(Short parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    
    @Column(name="url", nullable=false, length=65535)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


