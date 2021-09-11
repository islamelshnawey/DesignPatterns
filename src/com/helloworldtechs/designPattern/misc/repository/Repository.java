package com.helloworldtechs.designPattern.misc.repository;

import java.util.List;

public interface Repository<T> {
    void add(T t);
    List<T> getAll();
    List<T> findBySpecification(Specification specification);
    void update(T oldT, T newT);
    void remove(long id);
}