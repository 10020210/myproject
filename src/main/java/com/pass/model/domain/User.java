package com.pass.model.domain;


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user"
    ,catalog="mysql"
)
public class User  implements java.io.Serializable {


     private UserId id;
     private String selectPriv;
     private String insertPriv;
     private String updatePriv;
     private String deletePriv;
     private String createPriv;
     private String dropPriv;
     private String reloadPriv;
     private String shutdownPriv;
     private String processPriv;
     private String filePriv;
     private String grantPriv;
     private String referencesPriv;
     private String indexPriv;
     private String alterPriv;
     private String showDbPriv;
     private String superPriv;
     private String createTmpTablePriv;
     private String lockTablesPriv;
     private String executePriv;
     private String replSlavePriv;
     private String replClientPriv;
     private String createViewPriv;
     private String showViewPriv;
     private String createRoutinePriv;
     private String alterRoutinePriv;
     private String createUserPriv;
     private String eventPriv;
     private String triggerPriv;
     private String createTablespacePriv;
     private String sslType;
     private byte[] sslCipher;
     private byte[] x509Issuer;
     private byte[] x509Subject;
     private int maxQuestions;
     private int maxUpdates;
     private int maxConnections;
     private int maxUserConnections;
     private String plugin;
     private String authenticationString;
     private String passwordExpired;
     private Date passwordLastChanged;
     private Short passwordLifetime;
     private String accountLocked;

    public User() {
    }

	
    public User(UserId id, String selectPriv, String insertPriv, String updatePriv, String deletePriv, String createPriv, String dropPriv, String reloadPriv, String shutdownPriv, String processPriv, String filePriv, String grantPriv, String referencesPriv, String indexPriv, String alterPriv, String showDbPriv, String superPriv, String createTmpTablePriv, String lockTablesPriv, String executePriv, String replSlavePriv, String replClientPriv, String createViewPriv, String showViewPriv, String createRoutinePriv, String alterRoutinePriv, String createUserPriv, String eventPriv, String triggerPriv, String createTablespacePriv, String sslType, byte[] sslCipher, byte[] x509Issuer, byte[] x509Subject, int maxQuestions, int maxUpdates, int maxConnections, int maxUserConnections, String plugin, String passwordExpired, String accountLocked) {
        this.id = id;
        this.selectPriv = selectPriv;
        this.insertPriv = insertPriv;
        this.updatePriv = updatePriv;
        this.deletePriv = deletePriv;
        this.createPriv = createPriv;
        this.dropPriv = dropPriv;
        this.reloadPriv = reloadPriv;
        this.shutdownPriv = shutdownPriv;
        this.processPriv = processPriv;
        this.filePriv = filePriv;
        this.grantPriv = grantPriv;
        this.referencesPriv = referencesPriv;
        this.indexPriv = indexPriv;
        this.alterPriv = alterPriv;
        this.showDbPriv = showDbPriv;
        this.superPriv = superPriv;
        this.createTmpTablePriv = createTmpTablePriv;
        this.lockTablesPriv = lockTablesPriv;
        this.executePriv = executePriv;
        this.replSlavePriv = replSlavePriv;
        this.replClientPriv = replClientPriv;
        this.createViewPriv = createViewPriv;
        this.showViewPriv = showViewPriv;
        this.createRoutinePriv = createRoutinePriv;
        this.alterRoutinePriv = alterRoutinePriv;
        this.createUserPriv = createUserPriv;
        this.eventPriv = eventPriv;
        this.triggerPriv = triggerPriv;
        this.createTablespacePriv = createTablespacePriv;
        this.sslType = sslType;
        this.sslCipher = sslCipher;
        this.x509Issuer = x509Issuer;
        this.x509Subject = x509Subject;
        this.maxQuestions = maxQuestions;
        this.maxUpdates = maxUpdates;
        this.maxConnections = maxConnections;
        this.maxUserConnections = maxUserConnections;
        this.plugin = plugin;
        this.passwordExpired = passwordExpired;
        this.accountLocked = accountLocked;
    }
    public User(UserId id, String selectPriv, String insertPriv, String updatePriv, String deletePriv, String createPriv, String dropPriv, String reloadPriv, String shutdownPriv, String processPriv, String filePriv, String grantPriv, String referencesPriv, String indexPriv, String alterPriv, String showDbPriv, String superPriv, String createTmpTablePriv, String lockTablesPriv, String executePriv, String replSlavePriv, String replClientPriv, String createViewPriv, String showViewPriv, String createRoutinePriv, String alterRoutinePriv, String createUserPriv, String eventPriv, String triggerPriv, String createTablespacePriv, String sslType, byte[] sslCipher, byte[] x509Issuer, byte[] x509Subject, int maxQuestions, int maxUpdates, int maxConnections, int maxUserConnections, String plugin, String authenticationString, String passwordExpired, Date passwordLastChanged, Short passwordLifetime, String accountLocked) {
       this.id = id;
       this.selectPriv = selectPriv;
       this.insertPriv = insertPriv;
       this.updatePriv = updatePriv;
       this.deletePriv = deletePriv;
       this.createPriv = createPriv;
       this.dropPriv = dropPriv;
       this.reloadPriv = reloadPriv;
       this.shutdownPriv = shutdownPriv;
       this.processPriv = processPriv;
       this.filePriv = filePriv;
       this.grantPriv = grantPriv;
       this.referencesPriv = referencesPriv;
       this.indexPriv = indexPriv;
       this.alterPriv = alterPriv;
       this.showDbPriv = showDbPriv;
       this.superPriv = superPriv;
       this.createTmpTablePriv = createTmpTablePriv;
       this.lockTablesPriv = lockTablesPriv;
       this.executePriv = executePriv;
       this.replSlavePriv = replSlavePriv;
       this.replClientPriv = replClientPriv;
       this.createViewPriv = createViewPriv;
       this.showViewPriv = showViewPriv;
       this.createRoutinePriv = createRoutinePriv;
       this.alterRoutinePriv = alterRoutinePriv;
       this.createUserPriv = createUserPriv;
       this.eventPriv = eventPriv;
       this.triggerPriv = triggerPriv;
       this.createTablespacePriv = createTablespacePriv;
       this.sslType = sslType;
       this.sslCipher = sslCipher;
       this.x509Issuer = x509Issuer;
       this.x509Subject = x509Subject;
       this.maxQuestions = maxQuestions;
       this.maxUpdates = maxUpdates;
       this.maxConnections = maxConnections;
       this.maxUserConnections = maxUserConnections;
       this.plugin = plugin;
       this.authenticationString = authenticationString;
       this.passwordExpired = passwordExpired;
       this.passwordLastChanged = passwordLastChanged;
       this.passwordLifetime = passwordLifetime;
       this.accountLocked = accountLocked;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="Host", nullable=false, length=60) ), 
        @AttributeOverride(name="user", column=@Column(name="User", nullable=false, length=32) ) } )
    public UserId getId() {
        return this.id;
    }
    
    public void setId(UserId id) {
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

    
    @Column(name="Reload_priv", nullable=false, length=2)
    public String getReloadPriv() {
        return this.reloadPriv;
    }
    
    public void setReloadPriv(String reloadPriv) {
        this.reloadPriv = reloadPriv;
    }

    
    @Column(name="Shutdown_priv", nullable=false, length=2)
    public String getShutdownPriv() {
        return this.shutdownPriv;
    }
    
    public void setShutdownPriv(String shutdownPriv) {
        this.shutdownPriv = shutdownPriv;
    }

    
    @Column(name="Process_priv", nullable=false, length=2)
    public String getProcessPriv() {
        return this.processPriv;
    }
    
    public void setProcessPriv(String processPriv) {
        this.processPriv = processPriv;
    }

    
    @Column(name="File_priv", nullable=false, length=2)
    public String getFilePriv() {
        return this.filePriv;
    }
    
    public void setFilePriv(String filePriv) {
        this.filePriv = filePriv;
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

    
    @Column(name="Show_db_priv", nullable=false, length=2)
    public String getShowDbPriv() {
        return this.showDbPriv;
    }
    
    public void setShowDbPriv(String showDbPriv) {
        this.showDbPriv = showDbPriv;
    }

    
    @Column(name="Super_priv", nullable=false, length=2)
    public String getSuperPriv() {
        return this.superPriv;
    }
    
    public void setSuperPriv(String superPriv) {
        this.superPriv = superPriv;
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

    
    @Column(name="Execute_priv", nullable=false, length=2)
    public String getExecutePriv() {
        return this.executePriv;
    }
    
    public void setExecutePriv(String executePriv) {
        this.executePriv = executePriv;
    }

    
    @Column(name="Repl_slave_priv", nullable=false, length=2)
    public String getReplSlavePriv() {
        return this.replSlavePriv;
    }
    
    public void setReplSlavePriv(String replSlavePriv) {
        this.replSlavePriv = replSlavePriv;
    }

    
    @Column(name="Repl_client_priv", nullable=false, length=2)
    public String getReplClientPriv() {
        return this.replClientPriv;
    }
    
    public void setReplClientPriv(String replClientPriv) {
        this.replClientPriv = replClientPriv;
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

    
    @Column(name="Create_user_priv", nullable=false, length=2)
    public String getCreateUserPriv() {
        return this.createUserPriv;
    }
    
    public void setCreateUserPriv(String createUserPriv) {
        this.createUserPriv = createUserPriv;
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

    
    @Column(name="Create_tablespace_priv", nullable=false, length=2)
    public String getCreateTablespacePriv() {
        return this.createTablespacePriv;
    }
    
    public void setCreateTablespacePriv(String createTablespacePriv) {
        this.createTablespacePriv = createTablespacePriv;
    }

    
    @Column(name="ssl_type", nullable=false, length=9)
    public String getSslType() {
        return this.sslType;
    }
    
    public void setSslType(String sslType) {
        this.sslType = sslType;
    }

    
    @Column(name="ssl_cipher", nullable=false)
    public byte[] getSslCipher() {
        return this.sslCipher;
    }
    
    public void setSslCipher(byte[] sslCipher) {
        this.sslCipher = sslCipher;
    }

    
    @Column(name="x509_issuer", nullable=false)
    public byte[] getX509Issuer() {
        return this.x509Issuer;
    }
    
    public void setX509Issuer(byte[] x509Issuer) {
        this.x509Issuer = x509Issuer;
    }

    
    @Column(name="x509_subject", nullable=false)
    public byte[] getX509Subject() {
        return this.x509Subject;
    }
    
    public void setX509Subject(byte[] x509Subject) {
        this.x509Subject = x509Subject;
    }

    
    @Column(name="max_questions", nullable=false)
    public int getMaxQuestions() {
        return this.maxQuestions;
    }
    
    public void setMaxQuestions(int maxQuestions) {
        this.maxQuestions = maxQuestions;
    }

    
    @Column(name="max_updates", nullable=false)
    public int getMaxUpdates() {
        return this.maxUpdates;
    }
    
    public void setMaxUpdates(int maxUpdates) {
        this.maxUpdates = maxUpdates;
    }

    
    @Column(name="max_connections", nullable=false)
    public int getMaxConnections() {
        return this.maxConnections;
    }
    
    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    
    @Column(name="max_user_connections", nullable=false)
    public int getMaxUserConnections() {
        return this.maxUserConnections;
    }
    
    public void setMaxUserConnections(int maxUserConnections) {
        this.maxUserConnections = maxUserConnections;
    }

    
    @Column(name="plugin", nullable=false, length=64)
    public String getPlugin() {
        return this.plugin;
    }
    
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    
    @Column(name="authentication_string", length=65535)
    public String getAuthenticationString() {
        return this.authenticationString;
    }
    
    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString;
    }

    
    @Column(name="password_expired", nullable=false, length=2)
    public String getPasswordExpired() {
        return this.passwordExpired;
    }
    
    public void setPasswordExpired(String passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="password_last_changed", length=19)
    public Date getPasswordLastChanged() {
        return this.passwordLastChanged;
    }
    
    public void setPasswordLastChanged(Date passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
    }

    
    @Column(name="password_lifetime")
    public Short getPasswordLifetime() {
        return this.passwordLifetime;
    }
    
    public void setPasswordLifetime(Short passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
    }

    
    @Column(name="account_locked", nullable=false, length=2)
    public String getAccountLocked() {
        return this.accountLocked;
    }
    
    public void setAccountLocked(String accountLocked) {
        this.accountLocked = accountLocked;
    }




}


