package com.example.wrestling_show.repositories;

import com.example.wrestling_show.models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}
