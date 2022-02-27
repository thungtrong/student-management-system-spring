package com.springboot.practice.studentmanagement.repositories;

import com.springboot.practice.studentmanagement.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRes extends JpaRepository<Person, Integer>
{


}
