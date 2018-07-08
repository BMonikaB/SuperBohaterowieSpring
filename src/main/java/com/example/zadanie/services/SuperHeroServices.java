package com.example.zadanie.services;

import com.example.zadanie.domain.SuperHero;
import com.example.zadanie.domain.repository.SuperHeroRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperHeroServices {

    @Autowired
    SuperHeroRepositoryInterface superHeroRepositoryInterface;


}
