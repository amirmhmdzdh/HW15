package ir.hw15.Q2.A;

import ir.hw15.Q2.A.Person;
import ir.hw15.Q2.A.PersonRepository;

public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person signUp(String firstName, String lastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);

        personRepository.save(person);

        return person;
    }
}