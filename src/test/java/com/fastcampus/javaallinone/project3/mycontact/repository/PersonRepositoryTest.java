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
    void crud() {
        Person person = new Person();
        person.setName("shinjjune");
        person.setAge(25);
        person.setBloodType("B");

        personRepository.save(person);

        System.out.println(personRepository.findAll());

        List<Person> people = personRepository.findAll();

        assertThat(people.size()).isEqualTo(1);
        assertThat(people.get(0).getName()).isEqualTo("shinjjune");
        assertThat(people.get(0).getAge()).isEqualTo(25);
        assertThat(people.get(0).getBloodType()).isEqualTo("B");
    }
    @Test
    void hashCodeAndEquals() {
        Person person1 = new Person("shinjjune", 25,"B");
        Person person2 = new Person("shinjjune", 25,"B");

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        Map<Person, Integer> map = new HashMap<>();
        map.put(person1, person1.getAge());

        System.out.println(map);
        System.out.println(map.get(person2));
    }

    @Test
    void findByBloodType() {
        givenPerson("shinjjune", 10, "B");
        givenPerson("laca", 27, "O");
        givenPerson("ozil", 30, "AB");
        givenPerson("wenger", 66, "C");
        givenPerson("monreal", 31, "B");

        List<Person> result = personRepository.findByBloodType("B");

        result.forEach(System.out::println);
    }
    @Test
    void findByBirthdayBetween() {
        givenPerson("shinjjune", 10, "B",LocalDate.of(1991,8,30));
        givenPerson("laca", 27, "O",LocalDate.of(1992,7,10));
        givenPerson("ozil", 30, "AB",LocalDate.of(1993,1,5));
        givenPerson("wenger", 66, "C",LocalDate.of(1994,6,30));
        givenPerson("monreal", 31, "B",LocalDate.of(1995,8,30));

        List<Person> result = personRepository.findByMonthOfBirthday(8);

        result.forEach(System.out::println);
    }

    private void givenPerson(String name, int age, String bloodType) {
        givenPerson(name, age, bloodType, null);
    }

    private void givenPerson(String name, int age, String bloodType, LocalDate birthday) {
        Person person = new Person(name, age ,bloodType);
        person.setBirthday(new Birthday(birthday));

        personRepository.save(person);
    }


}