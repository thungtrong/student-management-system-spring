package com.springboot.practice.studentmanagement.model;

import java.util.Date;

public class Student 
{
    private String code;
    private String _class;
    private String major;
    private String department;
    private Date admission;
    private Date graduate;

    public Student(String code, String _class)
    {
	this.code = code;
	this._class = _class;
	
    }

    public String getCode()
    {
	return code;
    }

    public void setCode(String code)
    {
	this.code = code;
    }

    public String get_class()
    {
	return _class;
    }

    public void set_class(String _class)
    {
	this._class = _class;
    }

    public String getMajor()
    {
	return major;
    }

    public void setMajor(String major)
    {
	this.major = major;
    }

    public String getDepartment()
    {
	return department;
    }

    public void setDepartment(String department)
    {
	this.department = department;
    }

    public Date getAdmission()
    {
	return admission;
    }

    public void setAdmission(Date admission)
    {
	this.admission = admission;
    }

    public Date getGraduate()
    {
	return graduate;
    }

    public void setGraduate(Date graduate)
    {
	this.graduate = graduate;
    }

}
