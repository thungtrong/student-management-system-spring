package com.springboot.practice.studentmanagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.practice.studentmanagement.model.Person;
import com.springboot.practice.studentmanagement.model.Student;
import com.springboot.practice.studentmanagement.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController
{
    @Value("${database.name}")
    private String databaseName;

    @Autowired
    private Environment env;
    
    @Autowired
    private PersonService personService;
    
    @GetMapping("/")
    public String Hello(Model model, HttpServletRequest request)
    {
        System.out.println("Database Name: " + databaseName);
        System.out.println(env.getProperty("database.location"));

        // Some method to pass data to View
        model.addAttribute("name", "Spring Boot Practive");

        request.setAttribute("test", "Passing Data by Reuqest Object");

        // use Model
        return "hello";
    }
    
    @GetMapping("/persons")
    public String Persons(Model model) {
        List<Person> persons = personService.getAllPerson();
        model.addAttribute("persons", persons);
        System.out.println(persons.size());
        System.out.println(persons.get(0));
        System.out.println(persons.get(0).getFirstName());


        return "persons";
    }

    @GetMapping("/add-person")
    public String AddPerson(Model model)
    {
        Person person = new Person();
        person.setFirstName("First");
        person.setLastName("Person");
        person.setGender(true);
        personService.save(person);
        return "redirect:persons";
    }
}
