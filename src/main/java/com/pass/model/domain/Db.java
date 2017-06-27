package com.pass.model.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="db"
    ,catalog="mysql"
)
public class Db  implements java.io.Serializable {


     private DbId id;
     private String selectPriv;
     private String insertPriv;
     private String updatePriv;
     private String deletePriv;
     private String createPriv;
     private String dropPriv;
     private String grantPriv;
     private String referencesPriv;
     private String indexPriv;
     private String alterPriv;
     private String createTmpTablePriv;
     private String lockTablesPriv;
     private String createViewPriv;
     private String showViewPriv;
     private String createRoutinePriv;
     private String alterRoutinePriv;
     private String executePriv;
     private String eventPriv;
     private String triggerPriv;

    public Db() {
    }

    public Db(DbId id, String selectPriv, String insertPriv, String updatePriv, String deletePriv, String createPriv, String dropPriv, String grantPriv, String referencesPriv, String indexPriv, String alterPriv, String createTmpTablePriv, String lockTablesPriv, String createViewPriv, String showViewPriv, String createRoutinePriv, String alterRoutinePriv, String executePriv, String eventPriv, String triggerPriv) {
       this.id = id;
       this.selectPriv = selectPriv;
       this.insertPriv = insertPriv;
       this.updatePriv = updatePriv;
       this.deletePriv = deletePriv;
       this.createPriv = createPriv;
       this.dropPriv = dropPriv;
       this.grantPriv = grantPriv;
       this.referencesPriv = referencesPriv;
       this.indexPriv = indexPriv;
       this.alterPriv = alterPriv;
       this.createTmpTablePriv = createTmpTablePriv;
       this.lockTablesPriv = lockTablesPriv;
       this.createViewPriv = createViewPriv;
       this.showViewPriv = showViewPriv;
       this.createRoutinePriv = createRoutinePriv;
       this.alterRoutinePriv = alterRoutinePriv;
       this.executePriv = executePriv;
       this.eventPriv = eventPriv;
       this.triggerPriv = triggerPriv;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="Host", nullable=false, length=60) ), 
        @AttributeOverride(name="db", column=@Column(name="Db", nullable=false, length=64) ), 
        @AttributeOverride(name="user", column=@Column(name="User", nullable=false, length=32) ) } )
    public DbId getId() {
        return this.id;
    }
    
    public void setId(DbId id) {
        this.id = id;
    }

    
    @Column(name="Select_priv", nullable=false, length=2)
    public String getSelectPriv() {
        return this.selectPriv;
    }
    
    public void setSelectPriv(String selectPriv) {
        this.selectPriv = selectPriv;
    }

    
    @Column(name="Insert_priv", nullable=false, length=2)
    public String getInsertPriv() {
        return this.insertPriv;
    }
    
    public void setInsertPriv(String insertPriv) {
        this.insertPriv = insertPriv;
    }

    
    @Column(name="Update_priv", nullable=false, length=2)
    public String getUpdatePriv() {
        return this.updatePriv;
    }
    
    public void setUpdatePriv(String updatePriv) {
        this.updatePriv = updatePriv;
    }

    
    @Column(name="Delete_priv", nullable=false, length=2)
    public String getDeletePriv() {
        return this.deletePriv;
    }
    
    public void setDeletePriv(String deletePriv) {
        this.deletePriv = deletePriv;
    }

    
    @Column(name="Create_priv", nullable=false, length=2)
    public String getCreatePriv() {
        return this.createPriv;
    }
    
    public void setCreatePriv(String createPriv) {
        this.createPriv = createPriv;
    }

    
    @Column(name="Drop_priv", nullable=false, length=2)
    public String getDropPriv() {
        return this.dropPriv;
    }
    
    public void setDropPriv(String dropPriv) {
        this.dropPriv = dropPriv;
    }

    
    @Column(name="Grant_priv", nullable=false, length=2)
    public String getGrantPriv() {
        return this.grantPriv;
    }
    
    public void setGrantPriv(String grantPriv) {
        this.grantPriv = grantPriv;
    }

    
    @Column(name="References_priv", nullable=false, length=2)
    public String getReferencesPriv() {
        return this.referencesPriv;
    }
    
    public void setReferencesPriv(String referencesPriv) {
        this.referencesPriv = referencesPriv;
    }

    
    @Column(name="Index_priv", nullable=false, length=2)
    public String getIndexPriv() {
        return this.indexPriv;
    }
    
    public void setIndexPriv(String indexPriv) {
        this.indexPriv = indexPriv;
    }

    
    @Column(name="Alter_priv", nullable=false, length=2)
    public String getAlterPriv() {
        return this.alterPriv;
    }
    
    public void setAlterPriv(String alterPriv) {
        this.alterPriv = alterPriv;
    }

    
    @Column(name="Create_tmp_table_priv", nullable=false, length=2)
    public String getCreateTmpTablePriv() {
        return this.createTmpTablePriv;
    }
    
    public void setCreateTmpTablePriv(String createTmpTablePriv) {
        this.createTmpTablePriv = createTmpTablePriv;
    }

    
    @Column(name="Lock_tables_priv", nullable=false, length=2)
    public String getLockTablesPriv() {
        return this.lockTablesPriv;
    }
    
    public void setLockTablesPriv(String lockTablesPriv) {
        this.lockTablesPriv = lockTablesPriv;
    }

    
    @Column(name="Create_view_priv", nullable=false, length=2)
    public String getCreateViewPriv() {
        return this.createViewPriv;
    }
    
    public void setCreateViewPriv(String createViewPriv) {
        this.createViewPriv = createViewPriv;
    }

    
    @Column(name="Show_view_priv", nullable=false, length=2)
    public String getShowViewPriv() {
        return this.showViewPriv;
    }
    
    public void setShowViewPriv(String showViewPriv) {
        this.showViewPriv = showViewPriv;
    }

    
    @Column(name="Create_routine_priv", nullable=false, length=2)
    public String getCreateRoutinePriv() {
        return this.createRoutinePriv;
    }
    
    public void setCreateRoutinePriv(String createRoutinePriv) {
        this.createRoutinePriv = createRoutinePriv;
    }

    
    @Column(name="Alter_routine_priv", nullable=false, length=2)
    public String getAlterRoutinePriv() {
        return this.alterRoutinePriv;
    }
    
    public void setAlterRoutinePriv(String alterRoutinePriv) {
        this.alterRoutinePriv = alterRoutinePriv;
    }

    
    @Column(name="Execute_priv", nullable=false, length=2)
    public String getExecutePriv() {
        return this.executePriv;
    }
    
    public void setExecutePriv(String executePriv) {
        this.executePriv = executePriv;
    }

    
    @Column(name="Event_priv", nullable=false, length=2)
    public String getEventPriv() {
        return this.eventPriv;
    }
    
    public void setEventPriv(String eventPriv) {
        this.eventPriv = eventPriv;
    }

    
    @Column(name="Trigger_priv", nullable=false, length=2)
    public String getTriggerPriv() {
        return this.triggerPriv;
    }
    
    public void setTriggerPriv(String triggerPriv) {
        this.triggerPriv = triggerPriv;
    }




}


