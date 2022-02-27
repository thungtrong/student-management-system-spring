package com.springboot.practice.studentmanagement.service.impl;

import java.util.List;

import com.springboot.practice.studentmanagement.repositories.PersonRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.practice.studentmanagement.model.Person;
import com.springboot.practice.studentmanagement.repositories.PersonDao;
import com.springboot.practice.studentmanagement.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService
{
    //  use  JBDC
    @Autowired
    private PersonDao personDao;
    //  use Spring Data Jpa
    @Autowired
    private PersonRes personRes;

    @Override
    public List<Person> getAllPerson()
    {
	// TODO Auto-generated method stub
	
	return personDao.getAllPerson();
    }

    public void save(Person person)
    {
        personRes.save(person);
    }
}
