package com.example.Users.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String member;
    private String password;
    private String email;
    private byte[] image;

    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public byte getImage(){
        return image;
    }

    public void setImage(){
        this.image = image;
    }
}
