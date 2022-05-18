package com.example.wrestling_show.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Wrestler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String signature_move;

    @Column
    private int salary;

    @ManyToMany(mappedBy = "shows")
    @JsonIgnoreProperties(value = {"shows"})
    List<Show> shows;

    public Wrestler() {
    }

    public Wrestler(String name, String signature_move, int salary) {
        this.name = name;
        this.signature_move = signature_move;
        this.salary = salary;
        this.shows = new ArrayList<Show>();

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

    public String getSignature_move() {
        return signature_move;
    }

    public void setSignature_move(String signature_move) {
        this.signature_move = signature_move;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
