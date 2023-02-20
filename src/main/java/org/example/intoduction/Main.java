package org.example.intoduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {



        // singleton + prototype
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext5.xml");
        Car car1 = context.getBean("customCar", Car.class);
        Car car2 = context.getBean("customCar", Car.class);

        System.out.println(car1 == car2);
        System.out.println(car1);
        System.out.println(car2);

        context.close();

        // Часть 3.  внедрение зависимостей. set
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext3.xml");
//
//        Person person2 = context.getBean("customPerson", Person.class);
//        person2.drive();
//        context.close();

        // Часть 2.  внедрение зависимостей
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext2.xml");
//
//        Person person1 = context.getBean("customPerson", Person.class);
//        person1.drive();

        // Часть1
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Car car = context.getBean(Car.class);
//        car.go();
//        context.close();
    }
}
