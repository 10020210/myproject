package com.airport.model.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="001_Login_Roles_Master")
public class LoginRolesMaster  implements java.io.Serializable {


     private Integer roleId;
     private String roleName;
     private Set<OperatorMasterDetail> OperatorMasterDetails = new HashSet<OperatorMasterDetail>(0);

    public LoginRolesMaster() {
    }

	
    public LoginRolesMaster(String roleName) {
        this.roleName = roleName;
    }
    public LoginRolesMaster(String roleName, Set<OperatorMasterDetail> OperatorMasterDetails) {
       this.roleName = roleName;
       this.OperatorMasterDetails = OperatorMasterDetails;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="role_id", unique=true, nullable=false)
    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    
    @Column(name="role_name", nullable=false, length=30)
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loginRolesMaster")
    public Set<OperatorMasterDetail> getOperatorMasterDetails() {
        return this.OperatorMasterDetails;
    }
    
    public void setOperatorMasterDetails(Set<OperatorMasterDetail> OperatorMasterDetails) {
        this.OperatorMasterDetails = OperatorMasterDetails;
    }




}


