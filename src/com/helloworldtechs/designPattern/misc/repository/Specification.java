package com.helloworldtechs.designPattern.misc.repository;

/**
 *
 * @Author Ahmed Samy (serenitydiver@hotmail.com)
 */
public interface Specification<T> {

    boolean isExist(T t);
}