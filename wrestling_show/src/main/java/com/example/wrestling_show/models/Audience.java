package com.example.wrestling_show.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "audiences")
public class Audience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String emailAddress;

    @OneToMany(mappedBy = "audience")
    List<Show> shows;


    public Audience() {
    }

    public Audience(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.shows = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void addShow(Show show){
        shows.add(show);
    }

    public boolean removeShow(Show show){
       return shows.remove(show);
    }
}
