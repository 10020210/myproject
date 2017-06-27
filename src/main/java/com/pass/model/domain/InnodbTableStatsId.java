package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InnodbTableStatsId  implements java.io.Serializable {


     private String databaseName;
     private String tableName;

    public InnodbTableStatsId() {
    }

    public InnodbTableStatsId(String databaseName, String tableName) {
       this.databaseName = databaseName;
       this.tableName = tableName;
    }
   


    @Column(name="database_name", nullable=false, length=64)
    public String getDatabaseName() {
        return this.databaseName;
    }
    
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }


    @Column(name="table_name", nullable=false, length=64)
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InnodbTableStatsId) ) return false;
		 InnodbTableStatsId castOther = ( InnodbTableStatsId ) other; 
         
		 return ( (this.getDatabaseName()==castOther.getDatabaseName()) || ( this.getDatabaseName()!=null && castOther.getDatabaseName()!=null && this.getDatabaseName().equals(castOther.getDatabaseName()) ) )
 && ( (this.getTableName()==castOther.getTableName()) || ( this.getTableName()!=null && castOther.getTableName()!=null && this.getTableName().equals(castOther.getTableName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDatabaseName() == null ? 0 : this.getDatabaseName().hashCode() );
         result = 37 * result + ( getTableName() == null ? 0 : this.getTableName().hashCode() );
         return result;
   }   


}


