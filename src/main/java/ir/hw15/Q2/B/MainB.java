package ir.hw15.Q2.B;

import ir.hw15.Q2.A.Person;
import ir.hw15.Q2.A.PersonRepository;
import ir.hw15.Q2.A.PersonService;
import ir.hw15.Q2.B.Enum.Degree;
import ir.hw15.Q2.B.model.Student;
import ir.hw15.Q2.B.model.Teacher;
import ir.hw15.Q2.B.service.StudentService;
import ir.hw15.Q2.B.service.TeacherService;
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

        //-------------SignUp Teacher--------------------

//        TeacherService teacherService = new TeacherService(personRepository);
//        teacherService.signUp("karim", "filom", LocalDate.of(1340, 6, 6), "A12", "PHD", Degree.PROFESSOR, 120.00);


//             -------------SignUp Student--------------------
//        StudentService studentService = new StudentService(personRepository);
//        studentService.signUp("hassanykachal", "shalgham", LocalDate.of(1381, 4, 9), "B12", "ensani", 2011);

    }
}
