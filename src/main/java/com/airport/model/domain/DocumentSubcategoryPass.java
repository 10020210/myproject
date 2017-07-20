package com.airport.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="08_DocumentSubcategory_Pass")
public class DocumentSubcategoryPass  implements java.io.Serializable {


     private Integer documentpassTypeId;
     private int passtypeId;
     private int documentId;
     private String status;

    public DocumentSubcategoryPass() {
    }

	
    public DocumentSubcategoryPass(int passtypeId, int documentId) {
        this.passtypeId = passtypeId;
        this.documentId = documentId;
    }
    public DocumentSubcategoryPass(int passtypeId, int documentId, String status) {
       this.passtypeId = passtypeId;
       this.documentId = documentId;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="documentpass_type_id", unique=true, nullable=false)
    public Integer getDocumentpassTypeId() {
        return this.documentpassTypeId;
    }
    
    public void setDocumentpassTypeId(Integer documentpassTypeId) {
        this.documentpassTypeId = documentpassTypeId;
    }

    
    @Column(name="passtype_id", nullable=false)
    public int getPasstypeId() {
        return this.passtypeId;
    }
    
    public void setPasstypeId(int passtypeId) {
        this.passtypeId = passtypeId;
    }

    
    @Column(name="Document_id", nullable=false)
    public int getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    
    @Column(name="status", length=5)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


