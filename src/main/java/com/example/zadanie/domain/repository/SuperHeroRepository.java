package com.example.zadanie.domain.repository;


import com.example.zadanie.domain.SuperHero;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

@Repository
public class SuperHeroRepository implements SuperHeroRepositoryInterface{


    private Map<String, SuperHero> superHeroMap = new HashMap<>();



//dodaj
    @Override
    public void addSuperHero(String name, int age){
        superHeroMap.put(name, new SuperHero(name,age));
    }

    @Override
    public void addSuperHero2(SuperHero superHero) {
        superHeroMap.put(superHero.getName(),superHero );
    }


//print
    /*
    @Override
    public Collection<SuperHero> printSuperHeroList(){
    return superHeroMap.values();
    }
    */


    @Override
    public List<SuperHero> printSuperHeroList(){
        List<SuperHero> printSuperList = new ArrayList<>(superHeroMap.values());
        return printSuperList;
    }


  @Override
  public SuperHero getOneSuperHero(String name){
        return superHeroMap.get(name);
  }

    @Override
    public SuperHero remove(String name){
        return superHeroMap.remove(name);
    }

    @Override
    @PostConstruct
    public void buildStarterList(){
        addSuperHero("Xmen",33);
        addSuperHero("Deadpool", 35);
        addSuperHero("Thor", 40);
        addSuperHero("Walkiria", 30);
    }


    @Override
    public String toString() {
        return "SuperHeroRepository{" +
                "superHeroMap=" + superHeroMap +
                '}';
    }
}
