package com.airport.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="05_DocumentCategory_Master"
    , uniqueConstraints = @UniqueConstraint(columnNames="document_proof_type") 
)
public class DocumentCategoryMaster  implements java.io.Serializable {


     private Integer documentProofId;
     private String documentProofType;

    public DocumentCategoryMaster() {
    }

    public DocumentCategoryMaster(String documentProofType) {
       this.documentProofType = documentProofType;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="document_proof_id", unique=true, nullable=false)
    public Integer getDocumentProofId() {
        return this.documentProofId;
    }
    
    public void setDocumentProofId(Integer documentProofId) {
        this.documentProofId = documentProofId;
    }

    
    @Column(name="document_proof_type", unique=true, nullable=false, length=45)
    public String getDocumentProofType() {
        return this.documentProofType;
    }
    
    public void setDocumentProofType(String documentProofType) {
        this.documentProofType = documentProofType;
    }




}


