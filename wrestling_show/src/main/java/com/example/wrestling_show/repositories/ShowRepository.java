package com.example.wrestling_show.repositories;

import com.example.wrestling_show.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Long> {
}
