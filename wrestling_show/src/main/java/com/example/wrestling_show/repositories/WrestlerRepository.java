package com.example.wrestling_show.repositories;

import com.example.wrestling_show.models.Wrestler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WrestlerRepository extends JpaRepository<Wrestler, Long> {
}
