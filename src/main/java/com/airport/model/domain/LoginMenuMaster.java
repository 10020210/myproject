package com.airport.model.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="002_Login_Menu_Master")
public class LoginMenuMaster  implements java.io.Serializable {


     private Integer menuId;
     private String menuName;

    public LoginMenuMaster() {
    }

    public LoginMenuMaster(String menuName) {
       this.menuName = menuName;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="menu_id", unique=true, nullable=false)
    public Integer getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    
    @Column(name="menu_name", nullable=false, length=30)
    public String getMenuName() {
        return this.menuName;
    }
    
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }


}


