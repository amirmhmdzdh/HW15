package ir.hw15.Q2.A;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;

public class MainA {
    public static void main(String[] args) {

        // ---------------Create Table------------------------

        StandardServiceRegistry build = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(build)
                .addAnnotatedClass(Person.class)
                .buildMetadata()
                .buildSessionFactory();

        PersonRepository personRepository = new PersonRepository(sessionFactory);

        //----------Insert in table--------------------

//        Person person = new Person(1, "Amir", "mhmdzdh", LocalDate.of(1380, 11, 25));
//
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.merge(person);
//        transaction.commit();

        //-------------Save Method--------------------

//        Person person1 = new Person(null, "Ali", "karimi", LocalDate.of(1350, 5, 5));
//        personRepository.save(person1);


        //-------------Update Method--------------------

        Person person2 = new Person(3, "Ali", "bagheri", LocalDate.of(1350, 5, 4));
        personRepository.update(person2);

    }
}
