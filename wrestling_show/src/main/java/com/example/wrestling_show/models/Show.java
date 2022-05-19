package com.example.wrestling_show.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private int price;

    @ManyToMany
    @JoinTable(
            name = "audiences_purchases",
            joinColumns = {@JoinColumn(name = "show_id")},
            inverseJoinColumns = {@JoinColumn(name = "audience_id")}
    )
    @JsonIgnoreProperties({"shows"})
    private List<Audience> audiences;


//    @ManyToMany
//            @JoinTable(
//                    name = "shows_wrestler",
//                    joinColumns = {@JoinColumn(name = "show_id", nullable = false)},
//                    inverseJoinColumns = {@JoinColumn(name = "wrestler_id", nullable = false)}
//            )
//    @JsonIgnoreProperties(value = {"wrestlers"})
//    private List<Wrestler> wrestlers;




    public Show() {
    }



    public Show(String name, String location, int price) {
        this.name = name;
        this.location = location;
        this.price = price;
//        this.wrestlers = new ArrayList<Wrestler>();
        this.audiences = new ArrayList<Audience>();
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public List<Wrestler> getWrestlers() {
//        return wrestlers;
//    }
//
//    public void setWrestlers(List<Wrestler> wrestlers) {
//        this.wrestlers = wrestlers;
//    }


//    public void addWrestler(Wrestler wrestler){
//        wrestlers.add(wrestler);
//    }
//
//    public boolean removeWrestler(Wrestler wrestler){
//        return wrestlers.remove(wrestler);
//    }

    public List<Audience> getAudiences() {
        return audiences;
    }

    public void setAudiences(List<Audience> audiences) {
        this.audiences = audiences;
    }

    public void addAudience(Audience audience){
        this.audiences.add(audience);
    }



}
