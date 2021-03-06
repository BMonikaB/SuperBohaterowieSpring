package com.example.zadanie.domain.repository;

import com.example.zadanie.domain.SuperHero;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuperHeroRepositoryInterface {

    void addSuperHero(String name, int age);

    void addSuperHero2(SuperHero superHero);

    List<SuperHero> printSuperHeroList();

    SuperHero getOneSuperHero(String name);

    SuperHero remove(String name);


    void buildStarterList();
}
