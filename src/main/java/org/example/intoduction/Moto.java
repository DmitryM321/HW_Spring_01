package org.example.intoduction;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Transport{

    @Override
    public void go() {
        System.out.println("Мотоцикл едет");
    }
}
