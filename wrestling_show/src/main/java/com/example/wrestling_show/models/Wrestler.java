package com.example.wrestling_show.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Wrestler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
