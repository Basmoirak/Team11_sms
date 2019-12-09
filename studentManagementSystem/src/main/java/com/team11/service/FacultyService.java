package com.team11.service;

import java.util.List;

import com.team11.entity.Faculty;

public interface FacultyService {
public List<Faculty> getFaculties();
	
	public void saveFaculty(Faculty faculty);
	
	public Faculty getFaculty(String theId);
	
	public void deleteFaculty(String theId);
}
