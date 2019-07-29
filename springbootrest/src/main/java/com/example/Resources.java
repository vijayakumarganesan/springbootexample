package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resources {
	@RequestMapping("/students")
	public List<Students> getStudents()
	{
		List<Students> list=new ArrayList<Students>();
		Students std=new Students();
	    std.setName("vijay");
	    std.setCollege("psna");
	    std.setGender("male");
	    
	    Students std1=new Students();
	    std1.setName("kumar");
	    std1.setGender("male");
	    std1.setCollege("psna");
	    
	    list.add(std);
	    list.add(std1);
	    return list;
	}
	

}
