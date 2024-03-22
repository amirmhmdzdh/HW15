package ir.hw15.Q2.B.service;

import ir.hw15.Q2.A.PersonRepository;
import ir.hw15.Q2.B.model.Teacher;
import ir.hw15.Q2.B.Enum.Degree;

import java.time.LocalDate;

public class TeacherService {
    private PersonRepository teacherRepository;

    public TeacherService(PersonRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher signUp(String firstName, String lastName, LocalDate dateOfBirth, String teacherCode, String educationDegree, Degree teacherRank, double monthlySalary) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setDateOfBirth(dateOfBirth);
        teacher.setTeacherCode(teacherCode);
        teacher.setEducationDegree(educationDegree);
        teacher.setTeacherRank(teacherRank);
        teacher.setMonthlySalary(monthlySalary);

        teacherRepository.save(teacher);

        return teacher;
    }
}