package com.example.zadanie.controllers;

import com.example.zadanie.domain.SuperHero;
import com.example.zadanie.domain.repository.SuperHeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SuperHeroController {


@Autowired
SuperHeroRepository superHeroRepository;

    @RequestMapping("/superhero")
    public String getSuperHero(Model model){
        List<SuperHero> heroList = superHeroRepository.printSuperHeroList();
        model.addAttribute("superheroo",heroList);
        return "superheroes";
    }

    @RequestMapping("/createHero")
    public String createSuperHero(Model model){
        model.addAttribute("superhero",new SuperHero());
        return "createsuperhero";
    }



}
