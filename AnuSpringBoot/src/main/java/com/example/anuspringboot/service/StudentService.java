package com.example.anuspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.anuspringboot.dao.StudentRepository;
import com.example.anuspringboot.dto.StudentDTO;
import com.example.anuspringboot.entity.StudentEntity;

@Service
//For CRUD operations
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public StudentDTO createStudent(StudentDTO studentDTO) {

		StudentEntity studentEntity = new StudentEntity();
		BeanUtils.copyProperties(studentDTO, studentEntity);
		
		StudentEntity newStudentEntity = studentRepository.save(studentEntity);
		
		StudentDTO studentCreated=new StudentDTO();
		BeanUtils.copyProperties(studentEntity, studentCreated);
		
		return studentCreated;
	}
	
	public StudentDTO findStudent(Integer id) {
		StudentEntity studentEntity = studentRepository.findById(id).get();
		
		StudentDTO studentFound = new StudentDTO();
		BeanUtils.copyProperties(studentEntity, studentFound);
		
		return studentFound;
	}
	
	public List<StudentDTO> getAllStudents() {
		List<StudentEntity> studentEntityList = studentRepository.findAll();
		
		List<StudentDTO> studentDTOList = new ArrayList<StudentDTO>();
		studentEntityList.forEach(entity -> studentDTOList.add(getDTO(entity)));
	
		return studentDTOList;
	}
	
	public StudentDTO getDTO(StudentEntity entity) {
		StudentDTO studentDTO = new StudentDTO();
		BeanUtils.copyProperties(entity, studentDTO);
		return studentDTO;
	}
}
