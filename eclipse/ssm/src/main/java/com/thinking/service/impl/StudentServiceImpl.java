package com.thinking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.stat.TableStat.Name;
import com.thinking.dao.mapper.StudentMapper;
import com.thinking.dao.model.Student;
import com.thinking.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper mapper;

	@Override
	public List<Student> getAll() {
		return mapper.selectAll();
	}
	
	@Override
	public void addStudent(Student stu){
		 mapper.addStudent(stu);
	}
	@Override
	public void delStudent(int id){
		 mapper.deleteStudentById(id);
	}
	@Override
	public void updStudent(Student stu){
		 mapper.updateStudentById(stu);
	}
	
	@Override
	public List<Student> selectStuById(int id) {
		return mapper.selectStuById(id);
	}
	
	@Override
	public List<Student> selectByFirstName(String firstName){
		return mapper.selectByFirstName(firstName);
	}
}
