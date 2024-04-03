package ir.hw15.Q2.B.service;

import ir.hw15.Q2.A.PersonRepository;
import ir.hw15.Q2.B.model.Teacher;
import ir.hw15.Q2.B.Enum.Degree;
import ir.hw15.Q2.B.repository.TeacherRepository;

import java.time.LocalDate;

public class TeacherService {
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
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

    public void update(int id, String firstName, String lastName, LocalDate dateOfBirth, String teacherCode, String educationDegree, Degree teacherRank, double monthlySalary) {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setDateOfBirth(dateOfBirth);
        teacher.setTeacherCode(teacherCode);
        teacher.setEducationDegree(educationDegree);
        teacher.setTeacherRank(teacherRank);
        teacher.setMonthlySalary(monthlySalary);

        teacherRepository.update(teacher);


    }
}