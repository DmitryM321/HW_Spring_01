package org.example.intoduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        //  Часть 4.  Car scope singleton, а бину класса Moto scope prototype, а также определите в каждом из этих классов init- и destroy-методы.
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Transport transport1 = context.getBean("car", Car.class);
        Transport transport2 = context.getBean("car", Car.class);
        System.out.println(transport1 == transport2);
        System.out.println(transport1);
        System.out.println(transport2);
        context.close();
    }
}
