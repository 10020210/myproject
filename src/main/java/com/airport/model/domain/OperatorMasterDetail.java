package com.airport.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="005_Operator_Master_Detail"
    , uniqueConstraints = @UniqueConstraint(columnNames="operator_username") 
)
public class OperatorMasterDetail  implements java.io.Serializable {


     private Integer operatorId;
     private LoginRolesMaster loginRolesMaster;
     private String operatorName;
     private String operatorUsername;
     private String password;
     private Long operatorPhone;
     private String operatorEmail;
     private String menuId;
     private String categoryId;
     private String status;
     private byte[] operatorImage;

    public OperatorMasterDetail() {
    }

	
    public OperatorMasterDetail(LoginRolesMaster loginRolesMaster, String operatorName, String operatorUsername, String password, String menuId) {
        this.loginRolesMaster = loginRolesMaster;
        this.operatorName = operatorName;
        this.operatorUsername = operatorUsername;
        this.password = password;
        this.menuId = menuId;
    }
    public OperatorMasterDetail(LoginRolesMaster loginRolesMaster, String operatorName, String operatorUsername, String password, Long operatorPhone, String operatorEmail, String menuId, String categoryId, String status, byte[] operatorImage) {
       this.loginRolesMaster = loginRolesMaster;
       this.operatorName = operatorName;
       this.operatorUsername = operatorUsername;
       this.password = password;
       this.operatorPhone = operatorPhone;
       this.operatorEmail = operatorEmail;
       this.menuId = menuId;
       this.categoryId = categoryId;
       this.status = status;
       this.operatorImage = operatorImage;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="operator_id", unique=true, nullable=false)
    public Integer getOperatorId() {
        return this.operatorId;
    }
    
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="role_id", nullable=false)
    public LoginRolesMaster getLoginRolesMaster() {
        return this.loginRolesMaster;
    }
    
    public void setLoginRolesMaster(LoginRolesMaster loginRolesMaster) {
        this.loginRolesMaster = loginRolesMaster;
    }

    
    @Column(name="operator_name", nullable=false, length=30)
    public String getOperatorName() {
        return this.operatorName;
    }
    
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    
    @Column(name="operator_username", unique=true, nullable=false, length=15)
    public String getOperatorUsername() {
        return this.operatorUsername;
    }
    
    public void setOperatorUsername(String operatorUsername) {
        this.operatorUsername = operatorUsername;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="operator_phone")
    public Long getOperatorPhone() {
        return this.operatorPhone;
    }
    
    public void setOperatorPhone(Long operatorPhone) {
        this.operatorPhone = operatorPhone;
    }

    
    @Column(name="operator_email", length=30)
    public String getOperatorEmail() {
        return this.operatorEmail;
    }
    
    public void setOperatorEmail(String operatorEmail) {
        this.operatorEmail = operatorEmail;
    }

    
    @Column(name="menu_id", nullable=false, length=45)
    public String getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    
    @Column(name="category_id", length=45)
    public String getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="status", length=8)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="operator_image")
    public byte[] getOperatorImage() {
        return this.operatorImage;
    }
    
    public void setOperatorImage(byte[] operatorImage) {
        this.operatorImage = operatorImage;
    }




}


