package com.airport.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="06_DocumentSubCategory_Master"
    ,catalog="pmpml_live"
)
public class DocumentSubCategoryMaster  implements java.io.Serializable {


     private Integer documentNameId;
     private String documentName;
     private String status;

    public DocumentSubCategoryMaster() {
    }

	
    public DocumentSubCategoryMaster(String documentName) {
        this.documentName = documentName;
    }
    public DocumentSubCategoryMaster(String documentName, String status) {
       this.documentName = documentName;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Document_name_id", unique=true, nullable=false)
    public Integer getDocumentNameId() {
        return this.documentNameId;
    }
    
    public void setDocumentNameId(Integer documentNameId) {
        this.documentNameId = documentNameId;
    }

    
    @Column(name="Document_name", nullable=false, length=100)
    public String getDocumentName() {
        return this.documentName;
    }
    
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    
    @Column(name="status", length=5)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


