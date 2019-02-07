package com.luv2code.jsf.scopes;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	
	private List<Student> students;
	
	
	public StudentDataUtil() {
		loadSampleData();

	}
	
	public void loadSampleData() {
		students = new ArrayList<>();
		
		students.add(new Student("Merry" , "Public", "merry.pub@gmail.com"));
		students.add(new Student("John" , "Doe", "john.doe@gmail.com"));
		students.add(new Student("CJ" , "Smith", "smith@gmail.com"));
	}
	
	public List<Student> getStudents(){
		return students;
	}

}
