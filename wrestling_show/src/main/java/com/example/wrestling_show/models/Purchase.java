package com.example.wrestling_show.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties(value = {"purchases"})
    private Audience audience;

    public Purchase() {
    }

    @ManyToMany()
    @JoinTable(
            name = "purchases_shows",
            joinColumns = {@JoinColumn(name = "purchase_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "shows_id", nullable = false)}

            )
    @JsonIgnoreProperties(value = {"purchases"})
    List<Show> shows;




    public Purchase(Audience audience) {
        this.audience = audience;
        this.shows = new ArrayList<Show>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Audience getAudience() {
        return audience;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public void addShow(Show show){
        shows.add(show);
    }

    public boolean removeShow(Show show){
        return shows.remove(show);
    }
}
