package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slave_master_info"
    ,catalog="mysql"
)
public class SlaveMasterInfo  implements java.io.Serializable {


     private String channelName;
     private int numberOfLines;
     private String masterLogName;
     private long masterLogPos;
     private String host;
     private String userName;
     private String userPassword;
     private int port;
     private int connectRetry;
     private boolean enabledSsl;
     private String sslCa;
     private String sslCapath;
     private String sslCert;
     private String sslCipher;
     private String sslKey;
     private boolean sslVerifyServerCert;
     private float heartbeat;
     private String bind;
     private String ignoredServerIds;
     private String uuid;
     private long retryCount;
     private String sslCrl;
     private String sslCrlpath;
     private boolean enabledAutoPosition;
     private String tlsVersion;

    public SlaveMasterInfo() {
    }

	
    public SlaveMasterInfo(String channelName, int numberOfLines, String masterLogName, long masterLogPos, int port, int connectRetry, boolean enabledSsl, boolean sslVerifyServerCert, float heartbeat, long retryCount, boolean enabledAutoPosition) {
        this.channelName = channelName;
        this.numberOfLines = numberOfLines;
        this.masterLogName = masterLogName;
        this.masterLogPos = masterLogPos;
        this.port = port;
        this.connectRetry = connectRetry;
        this.enabledSsl = enabledSsl;
        this.sslVerifyServerCert = sslVerifyServerCert;
        this.heartbeat = heartbeat;
        this.retryCount = retryCount;
        this.enabledAutoPosition = enabledAutoPosition;
    }
    public SlaveMasterInfo(String channelName, int numberOfLines, String masterLogName, long masterLogPos, String host, String userName, String userPassword, int port, int connectRetry, boolean enabledSsl, String sslCa, String sslCapath, String sslCert, String sslCipher, String sslKey, boolean sslVerifyServerCert, float heartbeat, String bind, String ignoredServerIds, String uuid, long retryCount, String sslCrl, String sslCrlpath, boolean enabledAutoPosition, String tlsVersion) {
       this.channelName = channelName;
       this.numberOfLines = numberOfLines;
       this.masterLogName = masterLogName;
       this.masterLogPos = masterLogPos;
       this.host = host;
       this.userName = userName;
       this.userPassword = userPassword;
       this.port = port;
       this.connectRetry = connectRetry;
       this.enabledSsl = enabledSsl;
       this.sslCa = sslCa;
       this.sslCapath = sslCapath;
       this.sslCert = sslCert;
       this.sslCipher = sslCipher;
       this.sslKey = sslKey;
       this.sslVerifyServerCert = sslVerifyServerCert;
       this.heartbeat = heartbeat;
       this.bind = bind;
       this.ignoredServerIds = ignoredServerIds;
       this.uuid = uuid;
       this.retryCount = retryCount;
       this.sslCrl = sslCrl;
       this.sslCrlpath = sslCrlpath;
       this.enabledAutoPosition = enabledAutoPosition;
       this.tlsVersion = tlsVersion;
    }
   
     @Id 

    
    @Column(name="Channel_name", unique=true, nullable=false, length=64)
    public String getChannelName() {
        return this.channelName;
    }
    
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    
    @Column(name="Number_of_lines", nullable=false)
    public int getNumberOfLines() {
        return this.numberOfLines;
    }
    
    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    
    @Column(name="Master_log_name", nullable=false, length=65535)
    public String getMasterLogName() {
        return this.masterLogName;
    }
    
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    
    @Column(name="Master_log_pos", nullable=false)
    public long getMasterLogPos() {
        return this.masterLogPos;
    }
    
    public void setMasterLogPos(long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    
    @Column(name="Host", length=64)
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }

    
    @Column(name="User_name", length=65535)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="User_password", length=65535)
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    
    @Column(name="Port", nullable=false)
    public int getPort() {
        return this.port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }

    
    @Column(name="Connect_retry", nullable=false)
    public int getConnectRetry() {
        return this.connectRetry;
    }
    
    public void setConnectRetry(int connectRetry) {
        this.connectRetry = connectRetry;
    }

    
    @Column(name="Enabled_ssl", nullable=false)
    public boolean isEnabledSsl() {
        return this.enabledSsl;
    }
    
    public void setEnabledSsl(boolean enabledSsl) {
        this.enabledSsl = enabledSsl;
    }

    
    @Column(name="Ssl_ca", length=65535)
    public String getSslCa() {
        return this.sslCa;
    }
    
    public void setSslCa(String sslCa) {
        this.sslCa = sslCa;
    }

    
    @Column(name="Ssl_capath", length=65535)
    public String getSslCapath() {
        return this.sslCapath;
    }
    
    public void setSslCapath(String sslCapath) {
        this.sslCapath = sslCapath;
    }

    
    @Column(name="Ssl_cert", length=65535)
    public String getSslCert() {
        return this.sslCert;
    }
    
    public void setSslCert(String sslCert) {
        this.sslCert = sslCert;
    }

    
    @Column(name="Ssl_cipher", length=65535)
    public String getSslCipher() {
        return this.sslCipher;
    }
    
    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    
    @Column(name="Ssl_key", length=65535)
    public String getSslKey() {
        return this.sslKey;
    }
    
    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    
    @Column(name="Ssl_verify_server_cert", nullable=false)
    public boolean isSslVerifyServerCert() {
        return this.sslVerifyServerCert;
    }
    
    public void setSslVerifyServerCert(boolean sslVerifyServerCert) {
        this.sslVerifyServerCert = sslVerifyServerCert;
    }

    
    @Column(name="Heartbeat", nullable=false, precision=12, scale=0)
    public float getHeartbeat() {
        return this.heartbeat;
    }
    
    public void setHeartbeat(float heartbeat) {
        this.heartbeat = heartbeat;
    }

    
    @Column(name="Bind", length=65535)
    public String getBind() {
        return this.bind;
    }
    
    public void setBind(String bind) {
        this.bind = bind;
    }

    
    @Column(name="Ignored_server_ids", length=65535)
    public String getIgnoredServerIds() {
        return this.ignoredServerIds;
    }
    
    public void setIgnoredServerIds(String ignoredServerIds) {
        this.ignoredServerIds = ignoredServerIds;
    }

    
    @Column(name="Uuid", length=65535)
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    
    @Column(name="Retry_count", nullable=false)
    public long getRetryCount() {
        return this.retryCount;
    }
    
    public void setRetryCount(long retryCount) {
        this.retryCount = retryCount;
    }

    
    @Column(name="Ssl_crl", length=65535)
    public String getSslCrl() {
        return this.sslCrl;
    }
    
    public void setSslCrl(String sslCrl) {
        this.sslCrl = sslCrl;
    }

    
    @Column(name="Ssl_crlpath", length=65535)
    public String getSslCrlpath() {
        return this.sslCrlpath;
    }
    
    public void setSslCrlpath(String sslCrlpath) {
        this.sslCrlpath = sslCrlpath;
    }

    
    @Column(name="Enabled_auto_position", nullable=false)
    public boolean isEnabledAutoPosition() {
        return this.enabledAutoPosition;
    }
    
    public void setEnabledAutoPosition(boolean enabledAutoPosition) {
        this.enabledAutoPosition = enabledAutoPosition;
    }

    
    @Column(name="Tls_version", length=65535)
    public String getTlsVersion() {
        return this.tlsVersion;
    }
    
    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }




}


