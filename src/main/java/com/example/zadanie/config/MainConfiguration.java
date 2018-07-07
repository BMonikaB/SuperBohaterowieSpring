package com.example.zadanie.config;

import com.example.zadanie.domain.repository.SuperHeroRepository;
import com.example.zadanie.domain.repository.SuperHeroReposytoryBazy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class MainConfiguration {

    @Bean(name = "Podstawa")
    @Profile("one")
    @Primary
    public SuperHeroRepository superHeroRepository(){
        SuperHeroRepository superHeroRepository = new SuperHeroRepository();
        return superHeroRepository;
    }

    @Bean(name = "Dwa")
    @Profile("two")
    public SuperHeroReposytoryBazy superHeroReposytoryBazy(){
        SuperHeroReposytoryBazy superHeroReposytoryBazy = new SuperHeroReposytoryBazy();
        return superHeroReposytoryBazy;
    }
}
