package com.example.zadanie.services;

import com.example.zadanie.domain.Request;
import com.example.zadanie.domain.SuperHero;
import com.example.zadanie.domain.repository.RequestReposotory;
import com.example.zadanie.domain.repository.SuperHeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RequestServices {

    @Autowired
    SuperHeroRepository superHeroRepository;
    @Autowired
    RequestReposotory requestReposotory;


    Random random = new Random();

    public void randomTasks(String superHeroName){

        Request losoweZadanie = requestReposotory.printRequestList().get(random.nextInt(requestReposotory.printRequestList().size()));
        superHeroRepository.getOneSuperHero(superHeroName).setRequest(losoweZadanie);
        requestReposotory.remove(losoweZadanie);
    }
}
