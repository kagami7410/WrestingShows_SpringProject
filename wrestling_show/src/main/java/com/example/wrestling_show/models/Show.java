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

    @ManyToMany(mappedBy = "shows")
    @JsonIgnoreProperties(value ={"shows"})
    List<Purchase> purchases;

    @ManyToMany
            @JoinTable(
                    name = "shows_wrestler",
                    joinColumns = {@JoinColumn(name = "show_id", nullable = false)},
                    inverseJoinColumns = {@JoinColumn(name = "wrestler_id", nullable = false)}
            )
    @JsonIgnoreProperties(value = {"wrestlers"})
    List<Wrestler> wrestlers;




    public Show() {
    }

    public Show(String name, String location, int price) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.purchases = new ArrayList<Purchase>();
        this.wrestlers = new ArrayList<Wrestler>();
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

    public List<Wrestler> getWrestlers() {
        return wrestlers;
    }

    public void setWrestlers(List<Wrestler> wrestlers) {
        this.wrestlers = wrestlers;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public void addWrestler(Wrestler wrestler){
        wrestlers.add(wrestler);
    }

    public boolean removeWrestler(Wrestler wrestler){
        return wrestlers.remove(wrestler);
    }
    public void addPurchase(Purchase purchase){
        purchases.add(purchase);
    }

    public boolean removeWrestler(Purchase purchase){
        return purchases.remove(purchase);
    }
}
