package org.example.intoduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Transport transport;
    public Person(Transport transport) {
        this.transport = transport;
    }
//    @Qualifier("car")
//    @Autowired
//    public void setCar(Transport transport) {
//        this.transport = transport;
//    }
    void drive(){
        System.out.println("Владелец сел в транспорт");
        transport.go();
    }
}
