package com.sivanujan.indoorreservationsystembackend.Model;

import javax.persistence.*;

@Entity
@Table(name="badmintoncourt")
public class badmintoncourt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "email")
    private String email;
    @Column(name = "courtname")
    private String courtname;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;

    public badmintoncourt(String email, String courtname, String date, String time) {
        this.email = email;
        this.courtname = courtname;
        this.date = date;
        this.time = time;
    }

    public badmintoncourt() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourtname() {
        return courtname;
    }

    public void setCourtname(String courtname) {
        this.courtname = courtname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}





