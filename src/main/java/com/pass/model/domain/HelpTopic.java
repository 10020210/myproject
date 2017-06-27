package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="help_topic"
    ,catalog="mysql"
    , uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class HelpTopic  implements java.io.Serializable {


     private int helpTopicId;
     private String name;
     private short helpCategoryId;
     private String description;
     private String example;
     private String url;

    public HelpTopic() {
    }

    public HelpTopic(int helpTopicId, String name, short helpCategoryId, String description, String example, String url) {
       this.helpTopicId = helpTopicId;
       this.name = name;
       this.helpCategoryId = helpCategoryId;
       this.description = description;
       this.example = example;
       this.url = url;
    }
   
     @Id 

    
    @Column(name="help_topic_id", unique=true, nullable=false)
    public int getHelpTopicId() {
        return this.helpTopicId;
    }
    
    public void setHelpTopicId(int helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    
    @Column(name="name", unique=true, nullable=false, length=64)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="help_category_id", nullable=false)
    public short getHelpCategoryId() {
        return this.helpCategoryId;
    }
    
    public void setHelpCategoryId(short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    
    @Column(name="description", nullable=false, length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="example", nullable=false, length=65535)
    public String getExample() {
        return this.example;
    }
    
    public void setExample(String example) {
        this.example = example;
    }

    
    @Column(name="url", nullable=false, length=65535)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


