package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InnodbIndexStatsId  implements java.io.Serializable {


     private String databaseName;
     private String tableName;
     private String indexName;
     private String statName;

    public InnodbIndexStatsId() {
    }

    public InnodbIndexStatsId(String databaseName, String tableName, String indexName, String statName) {
       this.databaseName = databaseName;
       this.tableName = tableName;
       this.indexName = indexName;
       this.statName = statName;
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


    @Column(name="index_name", nullable=false, length=64)
    public String getIndexName() {
        return this.indexName;
    }
    
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }


    @Column(name="stat_name", nullable=false, length=64)
    public String getStatName() {
        return this.statName;
    }
    
    public void setStatName(String statName) {
        this.statName = statName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InnodbIndexStatsId) ) return false;
		 InnodbIndexStatsId castOther = ( InnodbIndexStatsId ) other; 
         
		 return ( (this.getDatabaseName()==castOther.getDatabaseName()) || ( this.getDatabaseName()!=null && castOther.getDatabaseName()!=null && this.getDatabaseName().equals(castOther.getDatabaseName()) ) )
 && ( (this.getTableName()==castOther.getTableName()) || ( this.getTableName()!=null && castOther.getTableName()!=null && this.getTableName().equals(castOther.getTableName()) ) )
 && ( (this.getIndexName()==castOther.getIndexName()) || ( this.getIndexName()!=null && castOther.getIndexName()!=null && this.getIndexName().equals(castOther.getIndexName()) ) )
 && ( (this.getStatName()==castOther.getStatName()) || ( this.getStatName()!=null && castOther.getStatName()!=null && this.getStatName().equals(castOther.getStatName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDatabaseName() == null ? 0 : this.getDatabaseName().hashCode() );
         result = 37 * result + ( getTableName() == null ? 0 : this.getTableName().hashCode() );
         result = 37 * result + ( getIndexName() == null ? 0 : this.getIndexName().hashCode() );
         result = 37 * result + ( getStatName() == null ? 0 : this.getStatName().hashCode() );
         return result;
   }   


}


