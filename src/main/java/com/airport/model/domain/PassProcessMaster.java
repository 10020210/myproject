package com.airport.model.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="992_Pass_Process_Master"
    ,catalog="pmpml_live"
)
public class PassProcessMaster  implements java.io.Serializable {


     private Long applnNo;
     private int userId;
     private String physicalApplnNo;
     private Long paymentId;
     private byte[] applicationFile;
     private String applicationStatus;
     private Integer passtypeId;
     private Integer validityPasstypeId;
     private String passStatus;
     private Date passRequestDate;
     private Date passApproveDate;
     private Date passRejectedDate;
     private Date exportedDate;
     private Date passStartDate;
     private Date passEndDate;
     private Date passIssueDate;
     private Integer requestedUserId;
     private Integer approvedUserId;
     private Integer issuedUserId;
     private String rejectionReason;
     private Integer rejectedUserId;
     private Integer exportedUserId;
     private Integer printerUserId;
     private Date passPrintedDate;
     private String refNo;
     private Date refLetterIssueDate;
     private Date fetchingDate;
     private Integer fetchingUserId;
     private Date reuploadApproveDate;
     private Date reuploadRejectedDate;
     private Date documentReuploadedDate;

    public PassProcessMaster() {
    }

	
    public PassProcessMaster(int userId) {
        this.userId = userId;
    }
    public PassProcessMaster(int userId, String physicalApplnNo, Long paymentId, byte[] applicationFile, String applicationStatus, Integer passtypeId, Integer validityPasstypeId, String passStatus, Date passRequestDate, Date passApproveDate, Date passRejectedDate, Date exportedDate, Date passStartDate, Date passEndDate, Date passIssueDate, Integer requestedUserId, Integer approvedUserId, Integer issuedUserId, String rejectionReason, Integer rejectedUserId, Integer exportedUserId, Integer printerUserId, Date passPrintedDate, String refNo, Date refLetterIssueDate, Date fetchingDate, Integer fetchingUserId, Date reuploadApproveDate, Date reuploadRejectedDate, Date documentReuploadedDate) {
       this.userId = userId;
       this.physicalApplnNo = physicalApplnNo;
       this.paymentId = paymentId;
       this.applicationFile = applicationFile;
       this.applicationStatus = applicationStatus;
       this.passtypeId = passtypeId;
       this.validityPasstypeId = validityPasstypeId;
       this.passStatus = passStatus;
       this.passRequestDate = passRequestDate;
       this.passApproveDate = passApproveDate;
       this.passRejectedDate = passRejectedDate;
       this.exportedDate = exportedDate;
       this.passStartDate = passStartDate;
       this.passEndDate = passEndDate;
       this.passIssueDate = passIssueDate;
       this.requestedUserId = requestedUserId;
       this.approvedUserId = approvedUserId;
       this.issuedUserId = issuedUserId;
       this.rejectionReason = rejectionReason;
       this.rejectedUserId = rejectedUserId;
       this.exportedUserId = exportedUserId;
       this.printerUserId = printerUserId;
       this.passPrintedDate = passPrintedDate;
       this.refNo = refNo;
       this.refLetterIssueDate = refLetterIssueDate;
       this.fetchingDate = fetchingDate;
       this.fetchingUserId = fetchingUserId;
       this.reuploadApproveDate = reuploadApproveDate;
       this.reuploadRejectedDate = reuploadRejectedDate;
       this.documentReuploadedDate = documentReuploadedDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="appln_no", unique=true, nullable=false)
    public Long getApplnNo() {
        return this.applnNo;
    }
    
    public void setApplnNo(Long applnNo) {
        this.applnNo = applnNo;
    }

    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="physical_appln_no", length=15)
    public String getPhysicalApplnNo() {
        return this.physicalApplnNo;
    }
    
    public void setPhysicalApplnNo(String physicalApplnNo) {
        this.physicalApplnNo = physicalApplnNo;
    }

    
    @Column(name="payment_id")
    public Long getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    
    @Column(name="application_file")
    public byte[] getApplicationFile() {
        return this.applicationFile;
    }
    
    public void setApplicationFile(byte[] applicationFile) {
        this.applicationFile = applicationFile;
    }

    
    @Column(name="application_status", length=23)
    public String getApplicationStatus() {
        return this.applicationStatus;
    }
    
    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    
    @Column(name="passtype_id")
    public Integer getPasstypeId() {
        return this.passtypeId;
    }
    
    public void setPasstypeId(Integer passtypeId) {
        this.passtypeId = passtypeId;
    }

    
    @Column(name="validityPasstype_id")
    public Integer getValidityPasstypeId() {
        return this.validityPasstypeId;
    }
    
    public void setValidityPasstypeId(Integer validityPasstypeId) {
        this.validityPasstypeId = validityPasstypeId;
    }

    
    @Column(name="pass_status", length=20)
    public String getPassStatus() {
        return this.passStatus;
    }
    
    public void setPassStatus(String passStatus) {
        this.passStatus = passStatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="pass_request_date", length=19)
    public Date getPassRequestDate() {
        return this.passRequestDate;
    }
    
    public void setPassRequestDate(Date passRequestDate) {
        this.passRequestDate = passRequestDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="pass_approve_date", length=19)
    public Date getPassApproveDate() {
        return this.passApproveDate;
    }
    
    public void setPassApproveDate(Date passApproveDate) {
        this.passApproveDate = passApproveDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="pass_rejected_date", length=19)
    public Date getPassRejectedDate() {
        return this.passRejectedDate;
    }
    
    public void setPassRejectedDate(Date passRejectedDate) {
        this.passRejectedDate = passRejectedDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="exported_date", length=19)
    public Date getExportedDate() {
        return this.exportedDate;
    }
    
    public void setExportedDate(Date exportedDate) {
        this.exportedDate = exportedDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="pass_start_date", length=19)
    public Date getPassStartDate() {
        return this.passStartDate;
    }
    
    public void setPassStartDate(Date passStartDate) {
        this.passStartDate = passStartDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="pass_end_date", length=19)
    public Date getPassEndDate() {
        return this.passEndDate;
    }
    
    public void setPassEndDate(Date passEndDate) {
        this.passEndDate = passEndDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="pass_issue_date", length=19)
    public Date getPassIssueDate() {
        return this.passIssueDate;
    }
    
    public void setPassIssueDate(Date passIssueDate) {
        this.passIssueDate = passIssueDate;
    }

    
    @Column(name="requested_user_id")
    public Integer getRequestedUserId() {
        return this.requestedUserId;
    }
    
    public void setRequestedUserId(Integer requestedUserId) {
        this.requestedUserId = requestedUserId;
    }

    
    @Column(name="approved_user_id")
    public Integer getApprovedUserId() {
        return this.approvedUserId;
    }
    
    public void setApprovedUserId(Integer approvedUserId) {
        this.approvedUserId = approvedUserId;
    }

    
    @Column(name="issued_user_id")
    public Integer getIssuedUserId() {
        return this.issuedUserId;
    }
    
    public void setIssuedUserId(Integer issuedUserId) {
        this.issuedUserId = issuedUserId;
    }

    
    @Column(name="rejection_reason", length=200)
    public String getRejectionReason() {
        return this.rejectionReason;
    }
    
    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    
    @Column(name="rejected_user_id")
    public Integer getRejectedUserId() {
        return this.rejectedUserId;
    }
    
    public void setRejectedUserId(Integer rejectedUserId) {
        this.rejectedUserId = rejectedUserId;
    }

    
    @Column(name="exported_user_id")
    public Integer getExportedUserId() {
        return this.exportedUserId;
    }
    
    public void setExportedUserId(Integer exportedUserId) {
        this.exportedUserId = exportedUserId;
    }

    
    @Column(name="printer_user_id")
    public Integer getPrinterUserId() {
        return this.printerUserId;
    }
    
    public void setPrinterUserId(Integer printerUserId) {
        this.printerUserId = printerUserId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="pass_printed_date", length=19)
    public Date getPassPrintedDate() {
        return this.passPrintedDate;
    }
    
    public void setPassPrintedDate(Date passPrintedDate) {
        this.passPrintedDate = passPrintedDate;
    }

    
    @Column(name="ref_no", length=50)
    public String getRefNo() {
        return this.refNo;
    }
    
    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ref_letter_issue_date", length=10)
    public Date getRefLetterIssueDate() {
        return this.refLetterIssueDate;
    }
    
    public void setRefLetterIssueDate(Date refLetterIssueDate) {
        this.refLetterIssueDate = refLetterIssueDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fetching_date", length=19)
    public Date getFetchingDate() {
        return this.fetchingDate;
    }
    
    public void setFetchingDate(Date fetchingDate) {
        this.fetchingDate = fetchingDate;
    }

    
    @Column(name="fetching_user_id")
    public Integer getFetchingUserId() {
        return this.fetchingUserId;
    }
    
    public void setFetchingUserId(Integer fetchingUserId) {
        this.fetchingUserId = fetchingUserId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="reupload_approve_date", length=19)
    public Date getReuploadApproveDate() {
        return this.reuploadApproveDate;
    }
    
    public void setReuploadApproveDate(Date reuploadApproveDate) {
        this.reuploadApproveDate = reuploadApproveDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="reupload_rejected_date", length=19)
    public Date getReuploadRejectedDate() {
        return this.reuploadRejectedDate;
    }
    
    public void setReuploadRejectedDate(Date reuploadRejectedDate) {
        this.reuploadRejectedDate = reuploadRejectedDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="document_reuploaded_date", length=19)
    public Date getDocumentReuploadedDate() {
        return this.documentReuploadedDate;
    }
    
    public void setDocumentReuploadedDate(Date documentReuploadedDate) {
        this.documentReuploadedDate = documentReuploadedDate;
    }




}


