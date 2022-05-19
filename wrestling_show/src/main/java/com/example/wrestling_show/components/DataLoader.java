package com.example.wrestling_show.components;

import com.example.wrestling_show.models.Audience;
import com.example.wrestling_show.models.Show;
import com.example.wrestling_show.repositories.AudienceRepository;
import com.example.wrestling_show.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {



    @Autowired
     ShowRepository showRepository;

    @Autowired
     AudienceRepository audienceRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        Show show1 = new Show("Raw", "Portland" , 60);
        Show show2 = new Show("Royal Rumble", "York Hall" , 40);
        Show show3 = new Show("Wrestle Mania", "Old Ford" , 55);
        Show show4 = new Show("Summer Slam", "Bedford" , 85);
        showRepository.saveAll(Arrays.asList(show1,show2,show3,show4));

//        Wrestler wrestler1 = new Wrestler("Jhon Cena", "AA", 34000, Arrays.asList(show1, show2, show4, show3 ));
//        Wrestler wrestler2 = new Wrestler("Cold Stone", "Stunner", 22000, Arrays.asList(show4, show3));
//        Wrestler wrestler3 = new Wrestler("Batista", "Batista Bomb", 23000, Arrays.asList(show1, show3));
//        Wrestler wrestler4 = new Wrestler("Triple H", "Pedigree", 30000, Arrays.asList(show3));
//        wrestlerRepository.saveAll(Arrays.asList(wrestler1,wrestler2,wrestler3,wrestler4));

        Audience audience1 = new Audience("Sujan", "sujangurung10@gmail.com");
        Audience audience2 = new Audience("Ricky", "ricky3210@gmail.com");
        Audience audience3 = new Audience("Larry", "larry_Hunt34@gmail.com");
        Audience audience4 = new Audience("Jhonny", "sinsi_lor40@gmail.com");
        Audience audience5 = new Audience("Philipe", "philipe83_lol@gmail.com");
        audienceRepository.saveAll(Arrays.asList(audience1,audience2,audience3,audience4,audience5));

//        Purchase purchase1 = new Purchase(audience1, Arrays.asList(show1, show2, show4, show3 ));
//        Purchase purchase2 = new Purchase(audience2, Arrays.asList(show1, show4, show3 ));
//        Purchase purchase3 = new Purchase(audience3, Arrays.asList( show4, show3 ));
//        Purchase purchase4 = new Purchase(audience4, Arrays.asList(show1));
//        Purchase purchase5 = new Purchase(audience1, Arrays.asList(show1,show3 ));
//        purchaseRepository.saveAll(Arrays.asList(purchase1,purchase2,purchase3, purchase4, purchase5));


        show1.addAudience(audience1);
        showRepository.save(show1);
        show1.addAudience(audience2);
        showRepository.save(show1);

    }
}
