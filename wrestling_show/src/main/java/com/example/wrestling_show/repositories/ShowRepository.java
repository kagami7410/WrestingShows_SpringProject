package com.example.wrestling_show.repositories;

import com.example.wrestling_show.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
//    public List<Show> getShowsByLocation();
}
