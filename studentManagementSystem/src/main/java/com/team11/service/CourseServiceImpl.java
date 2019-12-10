package com.team11.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.team11.dao.CourseRepository;
import com.team11.entity.Course;
import com.team11.entity.Department;

@Service
public class CourseServiceImpl implements CourseService{
	
	private CourseRepository courseRepository;
	
	@Autowired
	public void setCourseRepository(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	@Override
	@Transactional
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	@Transactional
	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}

	@Override
	@Transactional
	public Course getCourse(int id) {
		// TODO Auto-generated method stub
		return courseRepository.getOne(id);
	}

	@Override
	@Transactional
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}
	
	@Override
	@Transactional
	public List<Course> getAvailableCourses() {
		return courseRepository.getAvailableCourses();
	}
}
