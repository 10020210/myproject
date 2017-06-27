package com.pass.model.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="help_relation"
    ,catalog="mysql"
)
public class HelpRelation  implements java.io.Serializable {


     private HelpRelationId id;

    public HelpRelation() {
    }

    public HelpRelation(HelpRelationId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="helpKeywordId", column=@Column(name="help_keyword_id", nullable=false) ), 
        @AttributeOverride(name="helpTopicId", column=@Column(name="help_topic_id", nullable=false) ) } )
    public HelpRelationId getId() {
        return this.id;
    }
    
    public void setId(HelpRelationId id) {
        this.id = id;
    }




}


