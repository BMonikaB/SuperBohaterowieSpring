package com.example.zadanie.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class InfoSuperhero {

    private int id;
    private Request request;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int punkty =0;

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }
}
