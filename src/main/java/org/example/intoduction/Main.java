package org.example.intoduction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //  Часть 5.  Настройте конфигурацию без XML-файла
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("person", Person.class);
        person.drive();
        context.close();

//        //  Часть 4.  Car scope singleton, а бину класса Moto scope prototype, а также определите в каждом из этих классов init- и destroy-методы.
//        ClassPathXmlApplicationContext context =
//            new ClassPathXmlApplicationContext("applicationContext.xml");
//        Transport transport1 = context.getBean("moto", Moto.class);
//        Transport transport2 = context.getBean("moto", Moto.class);
//        System.out.println(transport1 == transport2);
//        System.out.println(transport1);
//        System.out.println(transport2);
//        context.close();


        //  Часть 3. Car аннотацию Component и затем решите проблему двойственной инъекции в классе Person
//        ClassPathXmlApplicationContext context =
//            new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person person = context.getBean("person", Person.class);
//        person.drive();
//        context.close();

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
