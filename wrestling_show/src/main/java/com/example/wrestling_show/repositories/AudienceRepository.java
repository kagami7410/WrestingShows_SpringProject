package com.example.wrestling_show.repositories;

import com.example.wrestling_show.models.Audience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudienceRepository extends JpaRepository<Audience, Long> {
}
