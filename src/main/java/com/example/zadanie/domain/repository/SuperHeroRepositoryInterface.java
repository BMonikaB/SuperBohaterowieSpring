package com.example.zadanie.domain.repository;

import com.example.zadanie.domain.SuperHero;

import javax.annotation.PostConstruct;
import java.util.List;

public interface SuperHeroRepositoryInterface {
    //dodaj
    void addSuperHero(String name, int age);

    //print
    List<SuperHero> printSuperHeroList();

    SuperHero getOneSuperHero(String name);

    SuperHero remove(String name);

    @PostConstruct
    void buildStarterList();
}
