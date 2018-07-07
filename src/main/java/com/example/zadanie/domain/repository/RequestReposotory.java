package com.example.zadanie.domain.repository;
import com.example.zadanie.domain.Request;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class RequestReposotory {

    List<Request> requestList = new ArrayList<>();

    public void addRequestList(String description){
        requestList.add(new Request(description));
    }

    public List<Request> printRequestList(){
        return requestList;
    }

    @PostConstruct
    public void builtStartList(){
        addRequestList("Walcz z wrogiem");
        addRequestList("Pomagaj ludziom");
        addRequestList("Zabij wroga");
        addRequestList("Pomóż innym w walce");
    }

    @Override
    public String toString() {
        return "RequestReposotory{" +
                "requestList=" + requestList +
                '}';
    }

   public void remove (Request usun){
         System.out.println(requestList.remove(usun));
   }

 
}
