package com.helloworldtechs.designPattern.misc.repository;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author Ahmed Samy (serenitydiver@hotmail.com)
 */
public class PersonStorage {
    private List<Person> personList;

    private static PersonStorage instance = new PersonStorage();


    private PersonStorage() {
        personList = new ArrayList<>();
    }

    public static PersonStorage getInstance() {
        return instance;
    }

    public PersonStorage(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

}