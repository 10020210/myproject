package com.airport.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="112_User_Document_Master")
public class UserDocumentMaster  implements java.io.Serializable {


     private Integer userDocId;
     private int userId;
     private int documentId;
     private String filename;
     private byte[] file;
     private String status;
     private String comment;

    public UserDocumentMaster() {
    }

	
    public UserDocumentMaster(int userId, int documentId, String filename, byte[] file, String status) {
        this.userId = userId;
        this.documentId = documentId;
        this.filename = filename;
        this.file = file;
        this.status = status;
    }
    public UserDocumentMaster(int userId, int documentId, String filename, byte[] file, String status, String comment) {
       this.userId = userId;
       this.documentId = documentId;
       this.filename = filename;
       this.file = file;
       this.status = status;
       this.comment = comment;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_doc_id", unique=true, nullable=false)
    public Integer getUserDocId() {
        return this.userDocId;
    }
    
    public void setUserDocId(Integer userDocId) {
        this.userDocId = userDocId;
    }

    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="Document_id", nullable=false)
    public int getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    
    @Column(name="filename", nullable=false, length=100)
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }

    
    @Column(name="file", nullable=false)
    public byte[] getFile() {
        return this.file;
    }
    
    public void setFile(byte[] file) {
        this.file = file;
    }

    
    @Column(name="status", nullable=false, length=21)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="comment", length=200)
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}


