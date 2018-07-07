package com.example.zadanie.services;

import com.example.zadanie.domain.Request;
import com.example.zadanie.domain.SuperHero;
import com.example.zadanie.domain.repository.RequestReposotory;
import com.example.zadanie.domain.repository.SuperHeroRepository;
import com.example.zadanie.domain.repository.SuperHeroRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RequestServices {

    @Autowired
    SuperHeroRepositoryInterface superHeroRepositoryInterface;
    @Autowired
    RequestReposotory requestReposotory;


    Random random = new Random();

    public void randomTasks(String superHeroName){

        Request losoweZadanie = requestReposotory.printRequestList().get(random.nextInt(requestReposotory.printRequestList().size()));
        superHeroRepositoryInterface.getOneSuperHero(superHeroName).setRequest(losoweZadanie);
        requestReposotory.remove(losoweZadanie);
    }
}
