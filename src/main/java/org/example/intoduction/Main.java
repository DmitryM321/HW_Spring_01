package org.example.intoduction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Часть 1. класс Moto должен быть помечен аннотацией Component.
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
        Moto moto = context.getBean("moto", Moto.class);
        moto.go();
        context.close();


    }
}
