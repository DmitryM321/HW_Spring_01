package org.example.intoduction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //  Часть 3. Car аннотацию Component и затем решите проблему двойственной инъекции в классе Person
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        person.drive();
        context.close();



        //  Часть 2. В методе main получите бин Person и вызовите у него метод, определенный в классе.
//        ClassPathXmlApplicationContext context =
//            new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person person = context.getBean("person", Person.class);
//        person.drive();
//        context.close();


//        // Часть 1. класс Moto должен быть помечен аннотацией Component.
//        ClassPathXmlApplicationContext context =
//            new ClassPathXmlApplicationContext("applicationContext.xml");
//        Moto moto = context.getBean("moto", Moto.class);
//        moto.go();
//        context.close();


    }
}
