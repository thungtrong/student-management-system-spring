package com.springboot.practice.studentmanagement.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionController
{
    @ExceptionHandler(NullPointerException.class)
    public String nullPoiter(Exception ex)
    {
	ex.printStackTrace();
	return path("null-pointer");
    }
    
    private String path(String view)
    {
	return "exception/%s".format(view);
    }
}
