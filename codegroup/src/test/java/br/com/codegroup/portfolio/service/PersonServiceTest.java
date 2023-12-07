package br.com.codegroup.portfolio.service;

import br.com.codegroup.portfolio.model.Person;
import br.com.codegroup.portfolio.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.NONE)
class PersonServiceTest {
    @Autowired
    private PersonRepository repository;
    @Autowired
    private PersonService service;
    @Test
    void createPerson() {
        Integer nPersons = service.getAllPersons().size();
        Person person = new Person("John Test",  new Date("11/11/1984"), 78788877788L,true, "developer", null);

        service.createPerson(person);

        assertTrue(service.getAllPersons().size() > nPersons);
    }

/*    Person createPerson(Person person);
    Person getPersonById(Long personId);
    List<Person> getAllPersons();
    Person updatePerson(Person person);
    void deletePerson(Long personId);

    Person addPersonToProject(ProjectMemberDto projectMemberDto);*/
}