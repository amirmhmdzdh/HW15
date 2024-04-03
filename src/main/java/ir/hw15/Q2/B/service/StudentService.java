package ir.hw15.Q2.B.service;

import ir.hw15.Q2.A.PersonRepository;
import ir.hw15.Q2.B.model.Student;
import ir.hw15.Q2.B.repository.StudentRepository;

import java.time.LocalDate;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student signUp(String firstName, String lastName, LocalDate dateOfBirth, String studentCode, String fieldOfStudy, int entryYear) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setDateOfBirth(dateOfBirth);
        student.setStudentCode(studentCode);
        student.setFieldOfStudy(fieldOfStudy);
        student.setEntryYear(entryYear);

        studentRepository.save(student);

        return student;
    }

    public void update(int id, String firstName, String lastName, LocalDate dateOfBirth, String studentCode, String fieldOfStudy, int entryYear) {
        Student student = new Student();
        student.setId(id);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setDateOfBirth(dateOfBirth);
        student.setStudentCode(studentCode);
        student.setFieldOfStudy(fieldOfStudy);
        student.setEntryYear(entryYear);

        studentRepository.update(student);


    }
}