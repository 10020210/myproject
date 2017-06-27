package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HelpRelationId  implements java.io.Serializable {


     private int helpKeywordId;
     private int helpTopicId;

    public HelpRelationId() {
    }

    public HelpRelationId(int helpKeywordId, int helpTopicId) {
       this.helpKeywordId = helpKeywordId;
       this.helpTopicId = helpTopicId;
    }
   


    @Column(name="help_keyword_id", nullable=false)
    public int getHelpKeywordId() {
        return this.helpKeywordId;
    }
    
    public void setHelpKeywordId(int helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }


    @Column(name="help_topic_id", nullable=false)
    public int getHelpTopicId() {
        return this.helpTopicId;
    }
    
    public void setHelpTopicId(int helpTopicId) {
        this.helpTopicId = helpTopicId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof HelpRelationId) ) return false;
		 HelpRelationId castOther = ( HelpRelationId ) other; 
         
		 return (this.getHelpKeywordId()==castOther.getHelpKeywordId())
 && (this.getHelpTopicId()==castOther.getHelpTopicId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getHelpKeywordId();
         result = 37 * result + this.getHelpTopicId();
         return result;
   }   


}


