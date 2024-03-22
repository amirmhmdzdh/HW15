package ir.hw15.Q2.B;

import ir.hw15.Q2.A.Person;
import ir.hw15.Q2.A.PersonRepository;
import ir.hw15.Q2.A.PersonService;
import ir.hw15.Q2.B.model.Student;
import ir.hw15.Q2.B.model.Teacher;
import ir.hw15.Q2.B.service.StudentService;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;

public class MainB {
    public static void main(String[] args) {
        //TODO  Create Table

        StandardServiceRegistry build = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(build)
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Teacher.class)
                .addAnnotatedClass(Student.class)
                .buildMetadata()
                .buildSessionFactory();
        PersonRepository personRepository = new PersonRepository(sessionFactory);
        PersonService personService = new PersonService(personRepository);

        //TODO  Insert to table

//        Person person = new Person(1, "Amir", "mhmdzdh", LocalDate.of(2000, 5, 5));
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.merge(person);
//        transaction.commit();

        //TODO save method

//        Person person1 = new Person(2, "hassan", "maml", LocalDate.of(1350, 1, 1));
//        personRepository.save(person1);

        //TODO Update method

//        Person person2 = new Person(2, "hassan", "ahmadi", LocalDate.of(1350, 1, 1));
//        personRepository.update(person2);


        //TODO delete method

        // personRepository.delete(2)

        //TODO loadAll

        //personRepository.loadAll();

        //TODO contains

        //System.out.println(personRepository.contains(3));


        //TODO SignUP

        // personService.signUp("Ali" , "Daei");


        //TODO Teachers

//        Teacher teacher = new Teacher();
//        TeacherService teacherService = new TeacherService(personRepository);
//        teacherService.signUp("karim", "filom", "A12", "PHD", Degree.PROFESSOR, 12.00);


        //TODO Students

        StudentService studentService = new StudentService(personRepository);
        studentService.signUp("hassanykachal", "shalgham",LocalDate.of(1350,4,4), "B12", "ensani", 2011);
    }
}
