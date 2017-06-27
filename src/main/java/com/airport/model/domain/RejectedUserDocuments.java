package com.airport.model.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="114_Rejected_User_Documents"
    ,catalog="pmpml_live"
)
public class RejectedUserDocuments  implements java.io.Serializable {


     private Integer rejectionDocId;
     private int userId;
     private Integer documentId;
     private Long applnNo;
     private byte[] file;

    public RejectedUserDocuments() {
    }

	
    public RejectedUserDocuments(int userId, byte[] file) {
        this.userId = userId;
        this.file = file;
    }
    public RejectedUserDocuments(int userId, Integer documentId, Long applnNo, byte[] file) {
       this.userId = userId;
       this.documentId = documentId;
       this.applnNo = applnNo;
       this.file = file;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="rejection_doc_id", unique=true, nullable=false)
    public Integer getRejectionDocId() {
        return this.rejectionDocId;
    }
    
    public void setRejectionDocId(Integer rejectionDocId) {
        this.rejectionDocId = rejectionDocId;
    }

    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="Document_id")
    public Integer getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    
    @Column(name="appln_no")
    public Long getApplnNo() {
        return this.applnNo;
    }
    
    public void setApplnNo(Long applnNo) {
        this.applnNo = applnNo;
    }

    
    @Column(name="file", nullable=false)
    public byte[] getFile() {
        return this.file;
    }
    
    public void setFile(byte[] file) {
        this.file = file;
    }




}


