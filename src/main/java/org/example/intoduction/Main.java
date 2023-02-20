package org.example.intoduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Часть 2.  внедрение зависимостей
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person1 = context.getBean("customPerson", Person.class);
        person1.drive();

        // Часть1
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Car car = context.getBean(Car.class);
//        car.go();
//        context.close();
    }
}
