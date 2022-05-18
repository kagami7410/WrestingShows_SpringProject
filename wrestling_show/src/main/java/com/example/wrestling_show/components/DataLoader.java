package com.example.wrestling_show.components;

import com.example.wrestling_show.models.Wrestler;
import com.example.wrestling_show.repositories.AudienceRepository;
import com.example.wrestling_show.repositories.PurchaseRepository;
import com.example.wrestling_show.repositories.ShowRepository;
import com.example.wrestling_show.repositories.WrestlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private WrestlerRepository wrestlerRepository;

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private AudienceRepository audienceRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
