package org.example.intoduction;

public class Person {
    private Transport transport;

//    public Person(Car car) {
//        this.car = car;
//    }

    public void setCar(Transport transport) {
        this.transport = transport;
    }

    void drive(){
        System.out.println("Владелец сел в автомобиль");
        transport.go();
    }
}
