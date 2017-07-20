package com.airport.model.domain;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="01_Pass_Category"
    , uniqueConstraints = @UniqueConstraint(columnNames="category_name") 
)
public class PassCategory  implements java.io.Serializable {


     private int categoryId;
     private String categoryName;
     private String status;
     private Set<PassSubcategory> passSubcategories = new HashSet<PassSubcategory>(0);

    public PassCategory() {
    }

	
    public PassCategory(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public PassCategory(int categoryId, String categoryName, String status, Set<PassSubcategory> passSubcategories) {
       this.categoryId = categoryId;
       this.categoryName = categoryName;
       this.status = status;
       this.passSubcategories = passSubcategories;
    }
   
     @Id 

    
    @Column(name="category_id", unique=true, nullable=false)
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="category_name", unique=true, nullable=false, length=25)
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    
    @Column(name="status", length=5)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="passCategory")
    public Set<PassSubcategory> getPassSubcategories() {
        return this.passSubcategories;
    }
    
    public void setPassSubcategories(Set<PassSubcategory> passSubcategories) {
        this.passSubcategories = passSubcategories;
    }


}


