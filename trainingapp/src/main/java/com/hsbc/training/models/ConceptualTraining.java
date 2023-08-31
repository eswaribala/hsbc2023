package com.hsbc.training.models;

import java.time.LocalDate;
import java.util.List;

public class ConceptualTraining {
	private long trainingId;
	private String courseName;
	private List<String> Skills;
	LocalDate  startDate;
	LocalDate endDate;	
	
	public ConceptualTraining(long trainingId, String courseName, List<String> skills, LocalDate startDate,
			LocalDate endDate) {
		super();
		this.trainingId = trainingId;
		this.courseName = courseName;
		Skills = skills;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public ConceptualTraining() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<String> getSkills() {
		return Skills;
	}
	public void setSkills(List<String> skills) {
		Skills = skills;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
}
