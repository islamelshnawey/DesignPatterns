package com.helloworldtechs.designPattern.misc.repository;

/**
 *
 * @Author Ahmed Samy (serenitydiver@hotmail.com)
 */
public class FindByPersonId implements Specification<Person> {

    private long userId;

    public FindByPersonId(long userId) {
        this.userId = userId;
    }


    @Override
    public boolean isExist(Person person) {
        return person.getId() == userId;
    }
}