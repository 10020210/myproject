package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servers"
    ,catalog="mysql"
)
public class Servers  implements java.io.Serializable {


     private String serverName;
     private String host;
     private String db;
     private String username;
     private String password;
     private int port;
     private String socket;
     private String wrapper;
     private String owner;

    public Servers() {
    }

    public Servers(String serverName, String host, String db, String username, String password, int port, String socket, String wrapper, String owner) {
       this.serverName = serverName;
       this.host = host;
       this.db = db;
       this.username = username;
       this.password = password;
       this.port = port;
       this.socket = socket;
       this.wrapper = wrapper;
       this.owner = owner;
    }
   
     @Id 

    
    @Column(name="Server_name", unique=true, nullable=false, length=64)
    public String getServerName() {
        return this.serverName;
    }
    
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    
    @Column(name="Host", nullable=false, length=64)
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }

    
    @Column(name="Db", nullable=false, length=64)
    public String getDb() {
        return this.db;
    }
    
    public void setDb(String db) {
        this.db = db;
    }

    
    @Column(name="Username", nullable=false, length=64)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="Password", nullable=false, length=64)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="Port", nullable=false)
    public int getPort() {
        return this.port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }

    
    @Column(name="Socket", nullable=false, length=64)
    public String getSocket() {
        return this.socket;
    }
    
    public void setSocket(String socket) {
        this.socket = socket;
    }

    
    @Column(name="Wrapper", nullable=false, length=64)
    public String getWrapper() {
        return this.wrapper;
    }
    
    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    
    @Column(name="Owner", nullable=false, length=64)
    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }




}


