package com.fastcampus.javaallinone.project3.mycontact.service;

import com.fastcampus.javaallinone.project3.mycontact.domain.Block;
import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import com.fastcampus.javaallinone.project3.mycontact.repository.BlockRepository;
import com.fastcampus.javaallinone.project3.mycontact.repository.PersonRepository;
import jdk.vm.ci.meta.Local;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@Transactional
@SpringBootTest
class PersonServiceTest {
    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepository personRepository;

    @Test
    void getPeopleExcludeBlocks() {
        List<Person> result = personService.getPeopleExcludeBlocks();

        personRepository.findAll().forEach(System.out::println);

        assertThat(result.size()).isEqualTo(4);
        assertThat(result.get(0).getName()).isEqualTo("shinjjune");
        assertThat(result.get(1).getName()).isEqualTo("hando");
        assertThat(result.get(2).getName()).isEqualTo("hyeju");
        assertThat(result.get(3).getName()).isEqualTo("wilshere");

    }

    @Test
    void getPeopleByyName(){
        List<Person> result= personService.getPeopleByName("shinjjune");

        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get(0).getName()).isEqualTo("shinjjune");
    }

    @Test
    void getPerson() {
        Person person = personService.getPerson(3L);

        assertThat(person.getName()).isEqualTo("jypark");
    }
}