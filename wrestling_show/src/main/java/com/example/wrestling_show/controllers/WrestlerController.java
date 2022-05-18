package com.example.wrestling_show.controllers;

import com.example.wrestling_show.models.Wrestler;
import com.example.wrestling_show.repositories.WrestlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("wrestlers")
public class WrestlerController {

    @Autowired
    WrestlerRepository wrestlerRepository;

    @GetMapping
    public ResponseEntity<List<Wrestler>> getWrestlers(){
        return new ResponseEntity<>(wrestlerRepository.findAll(), HttpStatus.OK);

    }
    //Show Mapping
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Wrestler>> getWrestler(@PathVariable Long id){
        var wrestler = wrestlerRepository.findById(id);

        // ternary operater: condition? true statement: false statement
        return new ResponseEntity<>(wrestler, wrestler.isEmpty() ? HttpStatus.NOT_FOUND: HttpStatus.OK);
    }

    //Create

    @PostMapping
    public void create(@RequestBody Wrestler wrestler){
        wrestlerRepository.save(wrestler);
    }

}
