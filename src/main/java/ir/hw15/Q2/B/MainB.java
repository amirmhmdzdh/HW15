package ir.hw15.Q2.B;

import ir.hw15.Q2.A.Person;
import ir.hw15.Q2.A.PersonRepository;
import ir.hw15.Q2.A.PersonService;
import ir.hw15.Q2.B.Enum.Degree;
import ir.hw15.Q2.B.model.Student;
import ir.hw15.Q2.B.model.Teacher;
import ir.hw15.Q2.B.repository.StudentRepository;
import ir.hw15.Q2.B.repository.TeacherRepository;
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
        TeacherRepository teacherRepository = new TeacherRepository(sessionFactory);
        StudentRepository studentRepository = new StudentRepository(sessionFactory);
        TeacherService teacherService = new TeacherService(teacherRepository);
        StudentService studentService = new StudentService(studentRepository);

//             -------------SignUp Teacher--------------------

//        teacherService.signUp("omid", "shadi", LocalDate.of(1380, 6, 6), "A12", "PHD", Degree.PROFESSOR, 120.00);


//             -------------SignUp Student--------------------

//        studentService.signUp("hassanykachal", "shalgham", LocalDate.of(1381, 4, 9), "B12", "ensani", 2011);


//            -------------Update Method--------------------
//        teacherService.update(2, "Ali", "jafari", LocalDate.of(1360, 6, 6), "B1", "diplome", Degree.ASSISTANT, 32.00);
//        studentService.update(1, "master", "hashemi", LocalDate.of(1380, 4, 4), "C2", "Bisavad", 2002);


//           -------------delete Method--------------------

//        teacherRepository.delete(2);
//        studentRepository.delete(2);


//        ------------loadAll Method--------------------

//        teacherRepository.loadAll();
//        studentRepository.loadAll();

//        -------------contains Method--------------------

//         System.out.println(teacherRepository.contains(2));
//        System.out.println(studentRepository.contains(2));






    }
}
