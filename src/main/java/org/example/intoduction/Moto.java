package org.example.intoduction;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//@Primary
@Component
//@Scope("prototype")
public class Moto implements Transport{
//    @PostConstruct
//    public void init(){
//        System.out.println("Класс Moto - Метод init");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Класс Moto - Метод destroy");
//    }

    @Override
    public void go() {
        System.out.println("Мотоцикл едет");
    }
}
