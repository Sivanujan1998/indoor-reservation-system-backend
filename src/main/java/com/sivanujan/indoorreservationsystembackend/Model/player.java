package com.sivanujan.indoorreservationsystembackend.Model;


import javax.persistence.*;


@Entity
@Table(name="player")
public class player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="email")
    private String email;
    @Column(name="gender")
    private String gender;
    @Column(name="name")
    private String name;


    @Column(name="password")
    private String password;
    @Column(name="phonenumber")
    private String phonenumber;

    public player(String name, String email, String gender, String phonenumber, String password) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.password = password;
    }

    public player() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
