package ir.hw15.Q2.A;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
//@Entity
public class Person {

    @Id
    @GeneratedValue()
    private Integer id;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;


}
