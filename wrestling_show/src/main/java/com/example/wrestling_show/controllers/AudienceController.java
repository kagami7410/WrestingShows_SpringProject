package com.example.wrestling_show.controllers;

import com.example.wrestling_show.models.Audience;
import com.example.wrestling_show.repositories.AudienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("audiences")
public class AudienceController {
    @Autowired
    AudienceRepository audienceRepository;

    @GetMapping
    public ResponseEntity<List<Audience>> getAudiences(){
        return new ResponseEntity<>(audienceRepository.findAll(), HttpStatus.OK);
    }

    //Show Mapping


    //Show
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Audience>> getAudience(@PathVariable Long id){
        return new ResponseEntity<>(audienceRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Audience> createAudience(@RequestBody Audience newAudience){
        audienceRepository.save(newAudience);
        return new ResponseEntity<>(newAudience, HttpStatus.CREATED);
    }



}
