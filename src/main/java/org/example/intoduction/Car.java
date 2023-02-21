package org.example.intoduction;

public class Car implements Transport{
    public void init(){
        System.out.println("Метод init");
    }
    public void destroy(){
        System.out.println("Метод destroy");
    }

    @Override
    public void go() {
        System.out.println("Автомобиль едет");
    }
}
