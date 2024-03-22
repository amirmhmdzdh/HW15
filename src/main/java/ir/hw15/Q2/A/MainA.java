package ir.hw15.Q2.A;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;

public class MainA {
    public static void main(String[] args) {

        // Create Table

        StandardServiceRegistry build = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(build)
                .addAnnotatedClass(Person.class)
                .buildMetadata()
                .buildSessionFactory();


       // Person person = new Person(1, "Amir", "mhmdzdh", LocalDate.of(1380, 11, 25));
    }
}
