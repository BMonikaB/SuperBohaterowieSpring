package com.example.zadanie.domain;


import java.util.Objects;

public class SuperHero {

    private String name;
    private int age;
    private Request request;

    public SuperHero(){};


    public SuperHero(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name :" + name + " age :" + age + " quest :" + request;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return age == superHero.age &&
                Objects.equals(name, superHero.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

}
