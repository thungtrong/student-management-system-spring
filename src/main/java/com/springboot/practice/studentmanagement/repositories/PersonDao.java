package com.springboot.practice.studentmanagement.repositories;

import java.util.List;

import com.springboot.practice.studentmanagement.model.Person;

public interface PersonDao
{
    public List<Person> getAllPerson();
}
