package ir.hw15.Q2.B.model;

import ir.hw15.Q2.A.Person;
import jakarta.persistence.Entity;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Person {

    private String studentCode;

    private String fieldOfStudy;

    private int entryYear;

}