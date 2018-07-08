package com.example.zadanie;

import com.example.zadanie.domain.repository.RequestReposotory;
import com.example.zadanie.domain.repository.SuperHeroRepository;
import com.example.zadanie.domain.repository.SuperHeroRepositoryInterface;
import com.example.zadanie.services.RequestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class App implements CommandLineRunner {

    @Autowired
    SuperHeroRepositoryInterface superHeroRepositoryInterface;
    @Autowired
    RequestReposotory requestReposotory;
    @Autowired
    RequestServices requestServices;

    @Override
    public void run(String... args) throws Exception {


/*

        requestReposotory.listRandomRequest();
        System.out.println(requestReposotory);
        requestReposotory.listRandomRequest();
        System.out.println(requestReposotory);
        requestReposotory.listRandomRequest();
        System.out.println(requestReposotory);
        requestReposotory.listRandomRequest();
        System.out.println(requestReposotory);
        requestReposotory.listRandomRequest();

/*
        requestServices.randomTasks("Xmen");
        requestServices.randomTasks("Deadpool");
        requestServices.randomTasks("Thor");
        requestServices.randomTasks("Walkiria");
*/




    }
}
