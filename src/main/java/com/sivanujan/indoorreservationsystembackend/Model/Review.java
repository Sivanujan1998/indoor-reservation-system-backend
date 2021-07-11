package com.sivanujan.indoorreservationsystembackend.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="feedback")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="time")
    private Date time=new Date();
    @Column(name="comment")
    private String comment;
    @Column(name="rate")
    private int rate;

    public Review(String name, Date time, String comment, int rate) {
        this.name = name;
        this.time = time;
        this.comment = comment;
        this.rate = rate;
    }

    public Review() {

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

    public Date getTime() {
        return time;
    }



    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}



