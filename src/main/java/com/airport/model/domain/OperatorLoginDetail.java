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
@Table(name="006_Operator_Login_Detail")
public class OperatorLoginDetail  implements java.io.Serializable {


     private Long userLoginId;
     private Integer operatorId;
     private String ipaddress;
     private Date loginTime;
     private Date logoutTime;
     private Integer passCenterId;

    public OperatorLoginDetail() {
    }

    public OperatorLoginDetail(Integer operatorId, String ipaddress, Date loginTime, Date logoutTime, Integer passCenterId) {
       this.operatorId = operatorId;
       this.ipaddress = ipaddress;
       this.loginTime = loginTime;
       this.logoutTime = logoutTime;
       this.passCenterId = passCenterId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_login_id", unique=true, nullable=false)
    public Long getUserLoginId() {
        return this.userLoginId;
    }
    
    public void setUserLoginId(Long userLoginId) {
        this.userLoginId = userLoginId;
    }

    
    @Column(name="operator_id")
    public Integer getOperatorId() {
        return this.operatorId;
    }
    
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    
    @Column(name="ipaddress", length=20)
    public String getIpaddress() {
        return this.ipaddress;
    }
    
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="login_time", length=19)
    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="logout_time", length=19)
    public Date getLogoutTime() {
        return this.logoutTime;
    }
    
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    
    @Column(name="pass_center_id")
    public Integer getPassCenterId() {
        return this.passCenterId;
    }
    
    public void setPassCenterId(Integer passCenterId) {
        this.passCenterId = passCenterId;
    }




}


