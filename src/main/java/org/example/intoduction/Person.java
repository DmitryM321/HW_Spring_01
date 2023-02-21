package org.example.intoduction;

public class Person {
    private Car car;

//    public Person(Car car) {
//        this.car = car;
//    }

    public void setCar(Car car) {
        this.car = car;
    }

    void drive(){
        System.out.println("Владелец сел в автомобиль");
        car.go();
    }
}
