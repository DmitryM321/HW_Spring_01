package org.example.intoduction;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//@Primary
//@Component
//@Scope("singleton")
public class Car implements Transport{
    @PostConstruct
    public void init(){
        System.out.println("Класс Car - Метод init");
    }
    @PreDestroy
     public void destroy(){
        System.out.println("Класс Car - Метод destroy");
    }

    @Override
    public void go() {
        System.out.println("Автомобиль едет");
    }

}
