package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProcsPrivId  implements java.io.Serializable {


     private String host;
     private String db;
     private String user;
     private String routineName;
     private String routineType;

    public ProcsPrivId() {
    }

    public ProcsPrivId(String host, String db, String user, String routineName, String routineType) {
       this.host = host;
       this.db = db;
       this.user = user;
       this.routineName = routineName;
       this.routineType = routineType;
    }
   


    @Column(name="Host", nullable=false, length=60)
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }


    @Column(name="Db", nullable=false, length=64)
    public String getDb() {
        return this.db;
    }
    
    public void setDb(String db) {
        this.db = db;
    }


    @Column(name="User", nullable=false, length=32)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }


    @Column(name="Routine_name", nullable=false, length=64)
    public String getRoutineName() {
        return this.routineName;
    }
    
    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }


    @Column(name="Routine_type", nullable=false, length=9)
    public String getRoutineType() {
        return this.routineType;
    }
    
    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProcsPrivId) ) return false;
		 ProcsPrivId castOther = ( ProcsPrivId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getDb()==castOther.getDb()) || ( this.getDb()!=null && castOther.getDb()!=null && this.getDb().equals(castOther.getDb()) ) )
 && ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getRoutineName()==castOther.getRoutineName()) || ( this.getRoutineName()!=null && castOther.getRoutineName()!=null && this.getRoutineName().equals(castOther.getRoutineName()) ) )
 && ( (this.getRoutineType()==castOther.getRoutineType()) || ( this.getRoutineType()!=null && castOther.getRoutineType()!=null && this.getRoutineType().equals(castOther.getRoutineType()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getDb() == null ? 0 : this.getDb().hashCode() );
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getRoutineName() == null ? 0 : this.getRoutineName().hashCode() );
         result = 37 * result + ( getRoutineType() == null ? 0 : this.getRoutineType().hashCode() );
         return result;
   }   


}


