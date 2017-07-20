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
@Table(name="111_User_Login_Online")
public class UserLoginOnline  implements java.io.Serializable {


     private Integer userLoginId;
     private int userId;
     private String ipaddress;
     private Date userLogin;
     private Date userLogout;

    public UserLoginOnline() {
    }

	
    public UserLoginOnline(int userId) {
        this.userId = userId;
    }
    public UserLoginOnline(int userId, String ipaddress, Date userLogin, Date userLogout) {
       this.userId = userId;
       this.ipaddress = ipaddress;
       this.userLogin = userLogin;
       this.userLogout = userLogout;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_login_id", unique=true, nullable=false)
    public Integer getUserLoginId() {
        return this.userLoginId;
    }
    
    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }

    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="ipaddress", length=16)
    public String getIpaddress() {
        return this.ipaddress;
    }
    
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="user_login", length=19)
    public Date getUserLogin() {
        return this.userLogin;
    }
    
    public void setUserLogin(Date userLogin) {
        this.userLogin = userLogin;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="user_logout", length=19)
    public Date getUserLogout() {
        return this.userLogout;
    }
    
    public void setUserLogout(Date userLogout) {
        this.userLogout = userLogout;
    }




}


