package com.springboot.practice.studentmanagement.repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.practice.studentmanagement.model.Person;
import com.springboot.practice.studentmanagement.repositories.PersonDao;

@Transactional
@Repository
public class PersonDaoImpl implements PersonDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Person> getAllPerson()
    {
	String sql = "SELECT * FROM Persons";
	return jdbcTemplate.query(sql, new RowMapper<Person>()
	{
	    @Override
	    public Person mapRow(ResultSet rs, int rowNum) throws SQLException
	    {
		
		// TODO Auto-generated method stub
		Person person = new Person(
			rs.getInt("ID"),
			rs.getString("last_name"),
			rs.getString("first_name"),
			rs.getBoolean("gender"),
			rs.getString("phone_number"),
			rs.getString("address"),
			rs.getDate("birthday")
		);
		
		return person;
	    }
	});
    }
}

