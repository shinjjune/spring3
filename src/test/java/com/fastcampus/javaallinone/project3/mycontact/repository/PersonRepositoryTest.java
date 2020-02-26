package com.fastcampus.javaallinone.project3.mycontact.repository;

import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import com.fastcampus.javaallinone.project3.mycontact.domain.dto.Birthday;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void findByName() {
        List<Person> people = personRepository.findByName("sammy");
        assertThat(people.size()).isEqualTo(1);

        Person person = people.get(0);
        assertAll(
                ()->assertThat(person.getName()).isEqualTo("sammy"),
                ()->assertThat(person.getHobby()).isEqualTo("reading"),
                ()->assertThat(person.getAddress()).isEqualTo("seoul"),
                ()->assertThat(person.getBirthday()).isEqualTo(Birthday.of(LocalDate.of(1991,7,10))),
                ()->assertThat(person.getJob()).isEqualTo("officer"),
                ()->assertThat(person.getPhoneNumber()).isEqualTo("010-2222-5555"),
                ()->assertThat(person.isDeleted()).isEqualTo(false)
        );
    }

    @Test
    void findByNameIfDeleted() {
        List<Person> people = personRepository.findByName("son");
        assertThat(people.size()).isEqualTo(0);
    }

    @Test
    void findByMonthOfBirthday(){
        List<Person> people = personRepository.findByMonthOfBirthday(7);

        assertThat(people.size()).isEqualTo(2);
        assertAll(
                ()->assertThat(people.get(0).getName()).isEqualTo("hando"),
                ()->assertThat(people.get(1).getName()).isEqualTo("sammy")
        );
    }

    @Test
    void findPeopleDeleted() {
        List<Person> people = personRepository.findPeopleDeleted();

        assertThat(people.size()).isEqualTo(1);
        assertThat(people.get(0).getName()).isEqualTo("son");
    }

}