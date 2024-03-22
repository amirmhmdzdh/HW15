package ir.hw15.Q2.B.model;

import ir.hw15.Q2.A.Person;
import ir.hw15.Q2.B.Enum.Degree;
import ir.hw15.Q2.B.Enum.DegreeConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher extends Person {

    private String teacherCode;

    private String educationDegree;

    @Convert(converter = DegreeConverter.class)
    private Degree teacherRank;

    private double monthlySalary;

}