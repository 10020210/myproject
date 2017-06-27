package com.airport.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="07_DocumentSubCategory_Category"
    ,catalog="pmpml_live"
)
public class DocumentSubCategoryCategory  implements java.io.Serializable {


     private Integer documentId;
     private int documentProofId;
     private int documentNameId;
     private String status;

    public DocumentSubCategoryCategory() {
    }

	
    public DocumentSubCategoryCategory(int documentProofId, int documentNameId) {
        this.documentProofId = documentProofId;
        this.documentNameId = documentNameId;
    }
    public DocumentSubCategoryCategory(int documentProofId, int documentNameId, String status) {
       this.documentProofId = documentProofId;
       this.documentNameId = documentNameId;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Document_id", unique=true, nullable=false)
    public Integer getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    
    @Column(name="document_proof_id", nullable=false)
    public int getDocumentProofId() {
        return this.documentProofId;
    }
    
    public void setDocumentProofId(int documentProofId) {
        this.documentProofId = documentProofId;
    }

    
    @Column(name="Document_name_id", nullable=false)
    public int getDocumentNameId() {
        return this.documentNameId;
    }
    
    public void setDocumentNameId(int documentNameId) {
        this.documentNameId = documentNameId;
    }

    
    @Column(name="status", length=5)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


