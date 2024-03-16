package com.raul.people_db.data;

import com.raul.people_db.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@Component
public class PersonDataLoader implements ApplicationRunner {

    private PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
            List<Person> people = List.of(
                    new Person(null, "Jake", "Snake", LocalDate.of(1950, 1, 1),"email@yahoo.com",  new BigDecimal("50000")),
                    new Person(null, "Sarah", "Smith", LocalDate.of(1960, 2, 1),"email@yahoo.com",  new BigDecimal("60000")),
                    new Person(null, "Johnny", "Jackson", LocalDate.of(1970, 3, 1),"email@yahoo.com",  new BigDecimal("70000")),
                    new Person(null, "jerry", "Smith", LocalDate.of(1980, 4, 1),"email@yahoo.com",  new BigDecimal("80000")),
                    new Person(null, "Bobby", "McGuire", LocalDate.of(1990, 5, 1),"email@yahoo.com",  new BigDecimal("90000")),
                    new Person(null, "Jane", "Smith", LocalDate.of(200, 6, 1),"email@yahoo.com",  new BigDecimal("100000"))
            );
            personRepository.saveAll(people);
        }
    }
}
