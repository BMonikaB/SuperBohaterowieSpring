package com.example.zadanie.domain.repository;
import com.example.zadanie.domain.Request;
import org.springframework.scheduling.annotation.Scheduled;
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

    /*
    @PostConstruct
    public void builtStartList(){
        addRequestList("Walcz z wrogiem");
        addRequestList("Pomagaj ludziom");
        addRequestList("Zabij wroga");
        addRequestList("Pomóż innym w walce");
    }
    */

    @Override
    public String toString() {
        return "RequestReposotory{" +
                "requestList=" + requestList +
                '}';
    }

   public void remove (Request usun){
         System.out.println(requestList.remove(usun));
   }

   Random random = new Random();

   //lista losowych zadań
    @Scheduled(fixedDelay = 5000)
    public void listRandomRequest(){
        List<String> description = new ArrayList<>();
        description.add("Walcz z wrogiem ");
        description.add("Pomóż człowiekowi");
        description.add("Zabij wroga");
        description.add("Uaktywnik super-moc");

        addRequestList(description.get(random.nextInt(description.size())));



    }

}
