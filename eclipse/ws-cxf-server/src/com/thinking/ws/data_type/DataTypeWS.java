package com.thinking.ws.data_type;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.thinking.ws.bean.Student;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description:
 */
@WebService
public interface DataTypeWS {
	
	@WebMethod
	public boolean addStudent(Student s);
	
	@WebMethod
	public Student getStudentById(int id);
	
	@WebMethod
	public List<Student> getStudentsByPrice(float price);
	
	@WebMethod
	public Map<Integer, Student> getAllStudents();
	
}
