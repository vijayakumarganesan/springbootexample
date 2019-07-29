package com.example;

public class Students {
	
	String name;
	String gender;
	String college;
	public Students()
	{
		
	}
	public Students(String name,String gender,String college)
	{
		this.name=name;
		this.gender=gender;
		this.college=college;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", gender=" + gender + ", college=" + college + "]";
	}
	
}
