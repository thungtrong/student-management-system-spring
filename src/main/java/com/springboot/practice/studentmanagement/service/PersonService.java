package com.springboot.practice.studentmanagement.service;

import java.util.List;

import com.springboot.practice.studentmanagement.model.Person;


public interface PersonService
{
    public List<Person> getAllPerson();

    public void save(Person person);
}
