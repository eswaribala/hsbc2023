package com.hsbc.training.models;

import java.time.LocalDate;
import java.util.List;

public class PracticalTraining extends ConceptualTraining{

	private short labDuration;

	
	public PracticalTraining(long trainingId, String courseName, List<String> skills, LocalDate startDate,
			LocalDate endDate, short labDuration) {
		super(trainingId, courseName, skills, startDate, endDate);
		this.labDuration = labDuration;
	}

	
	public PracticalTraining() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PracticalTraining(long trainingId, String courseName, List<String> skills, LocalDate startDate,
			LocalDate endDate) {
		super(trainingId, courseName, skills, startDate, endDate);
		// TODO Auto-generated constructor stub
	}


	public short getLabDuration() {
		return labDuration;
	}

	public void setLabDuration(short labDuration) {
		this.labDuration = labDuration;
	}
	
}
