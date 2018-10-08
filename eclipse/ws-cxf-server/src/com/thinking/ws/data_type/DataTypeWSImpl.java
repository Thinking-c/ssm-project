package com.thinking.ws.data_type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.thinking.ws.bean.Student;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description:
 */
@WebService
public class DataTypeWSImpl implements DataTypeWS {

	@Override
	public boolean addStudent(Student s) {
		System.out.println("server addStudent()" + s);
		return true;
	}

	@Override
	public Student getStudentById(int id) {
		System.out.println("server getStudentById()" + id);
		return new Student(id, "tutu", 1000);
	}

	@Override
	public List<Student> getStudentsByPrice(float price) {
		System.out.println("server getStudentsByPrice()" + price);
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "tutu1", price + 1));
		list.add(new Student(2, "tutu2", price + 2));
		list.add(new Student(3, "tutu3", price + 3));
		return list;
	}

	@Override
	public Map<Integer, Student> getAllStudents() {
		System.out.println("server getAllStudents()");
		Map<Integer, Student> map = new HashMap();
		map.put(1, new Student(1, "tom1", 20000));
		map.put(2, new Student(2, "tom2", 22000));
		map.put(3, new Student(3, "tom3", 23000));
		map.put(4, new Student(3, "tom4", 24000));
		return map;
	}

}
