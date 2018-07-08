package com.example.zadanie.domain.repository;

import com.example.zadanie.domain.SuperHero;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SuperHeroReposytoryBazy implements SuperHeroRepositoryInterface {


    @Override
    public void addSuperHero( String name, int age) {

    }

    @Override
    public void addSuperHero2(SuperHero superHero) {

    }

    @Override
    public List<SuperHero> printSuperHeroList() {
        return null;
    }

    @Override
    public SuperHero getOneSuperHero(String name) {
        return null;
    }

    @Override
    public SuperHero remove(String name) {
        return null;
    }

    @Override
    public void buildStarterList() {
        System.out.println("Nie z tego");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
