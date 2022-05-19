package com.example.wrestling_show.controllers;


import com.example.wrestling_show.models.Audience;
import com.example.wrestling_show.models.Show;
import com.example.wrestling_show.repositories.AudienceRepository;
import com.example.wrestling_show.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("shows")
public class ShowController {
    @Autowired
    ShowRepository showRepository;

    @GetMapping
    public ResponseEntity<List<Show>> getshows() {
        return new ResponseEntity<>(showRepository.findAll(), HttpStatus.OK);
    }

    //Show Mapping


    //Show
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Show>> getshow(@PathVariable Long id) {
        return new ResponseEntity<>(showRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Show> createShow(@RequestBody Show newShow) {
        showRepository.save(newShow);
        return new ResponseEntity<>(newShow, HttpStatus.CREATED);
    }
}

