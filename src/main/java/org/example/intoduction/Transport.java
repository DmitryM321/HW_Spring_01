package org.example.intoduction;

import org.springframework.stereotype.Component;

@Component
public interface Transport {
    default void go(){
        System.out.println("Metod transport");
    }

    }

