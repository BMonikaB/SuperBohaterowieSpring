package com.example.zadanie.controllers;

import com.example.zadanie.domain.SuperHero;
import com.example.zadanie.domain.repository.SuperHeroRepository;
import com.example.zadanie.services.RequestServices;
import com.example.zadanie.services.SuperHeroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SuperHeroController {


@Autowired
SuperHeroRepository superHeroRepository;
@Autowired
    SuperHeroServices superHeroServices;

//wyswietlenie
    @RequestMapping("/superhero")
    public String getSuperHero(Model model){
        List<SuperHero> heroList = superHeroRepository.printSuperHeroList();
        model.addAttribute("superheroatr",heroList);
        return "superheroes";
    }
//dodanie nowego
    @RequestMapping("/addsuperhero")
    public String addSuperhero(Model model){
        model.addAttribute("superhero", new SuperHero());
        return "createsuperhero";
    }

    //
    @RequestMapping(value = "/superhero",method = RequestMethod.POST)
    public String zapisz(SuperHero superHero){
        superHeroRepository.addSuperHero2(superHero);
    return "redirect:/superhero"; //przekierowanie
    }




}
