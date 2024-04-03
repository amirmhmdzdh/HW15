package ir.hw15.Q2.B.model;

import ir.hw15.Q2.A.Person;
import ir.hw15.Q2.B.Enum.Degree;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher extends Person {

    private Integer id;

    private String teacherCode;

    private String educationDegree;

    @Enumerated(EnumType.STRING)
    private Degree teacherRank;

    private double monthlySalary;

}