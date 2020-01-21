package com.cmcguire.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Name is required")
    private String userName;
    
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Location is required")
    private String location;

    public User() {}

    public User(String name, String email, String location) {
        this.userName = name;
        this.email = email;
        this.location = location;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) { this.location = location; }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() { return location; }

}
