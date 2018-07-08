package com.example.zadanie.controllers;

import com.example.zadanie.components.TimeClass;
import com.example.zadanie.domain.InfoSuperhero;
import com.example.zadanie.domain.SuperHero;
import com.example.zadanie.domain.repository.SuperHeroRepository;
import com.example.zadanie.domain.repository.SuperHeroRepositoryInterface;
import com.example.zadanie.services.RequestServices;
import com.example.zadanie.services.SuperHeroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SuperHeroController {


@Autowired
    SuperHeroRepositoryInterface superHeroRepositoryInterface;

@Autowired
    TimeClass timeClass;
@Autowired
    InfoSuperhero infoSuperhero;


    @RequestMapping("/superhero")
    public String getSuperHero(Model model){
        List<SuperHero> heroList = superHeroRepositoryInterface.printSuperHeroList();
        model.addAttribute("superheroatr",heroList);
        model.addAttribute("timecom",timeClass);
        model.addAttribute("infosuperhero",infoSuperhero);
        return "superheroes";
    }
//dodanie nowego
    @RequestMapping("/addsuperhero")
    public String addSuperhero(Model model){
        model.addAttribute("superhero", new SuperHero());
        model.addAttribute("timecom",timeClass);
        model.addAttribute("infosuperhero",infoSuperhero);
        return "createsuperhero";
    }

    //
    @RequestMapping(value = "/superhero",method = RequestMethod.POST)
    public String zapisz(@Valid SuperHero superHero, BindingResult bindingResult){

            superHeroRepositoryInterface.addSuperHero2(superHero);
            return "redirect:/superhero"; //przekierowanie
        }




    //Usun(przez sciezke)
    @RequestMapping(value = "/superhero/delete/{name}")
    public String delete(@PathVariable("name")String name){
        superHeroRepositoryInterface.remove(name);
        return  "redirect:/superhero";
    }



}
