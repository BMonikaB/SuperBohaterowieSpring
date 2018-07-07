package com.example.zadanie.services;

import com.example.zadanie.domain.SuperHero;
import com.example.zadanie.domain.repository.SuperHeroRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class SuperHeroServices {

    @Autowired
    SuperHeroRepositoryInterface superHeroRepositoryInterface;

    public List<SuperHero> printSuperHero() {
        return new ArrayList<>(superHeroRepositoryInterface.printSuperHeroList());
    }
}
