package com.airport.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="003_Depot_List"
    ,catalog="pmpml_live"
    , uniqueConstraints = @UniqueConstraint(columnNames="depot_name") 
)
public class DepotList  implements java.io.Serializable {


     private int depotId;
     private String depotName;

    public DepotList() {
    }

    public DepotList(int depotId, String depotName) {
       this.depotId = depotId;
       this.depotName = depotName;
    }
   
     @Id 

    
    @Column(name="depot_id", unique=true, nullable=false)
    public int getDepotId() {
        return this.depotId;
    }
    
    public void setDepotId(int depotId) {
        this.depotId = depotId;
    }

    
    @Column(name="depot_name", unique=true, nullable=false, length=30)
    public String getDepotName() {
        return this.depotName;
    }
    
    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }




}


