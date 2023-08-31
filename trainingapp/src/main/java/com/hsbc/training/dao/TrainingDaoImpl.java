package com.hsbc.training.dao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import com.hsbc.training.bl.TrainingSorter;
import com.hsbc.training.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.training.exceptions.TrainingAlreadyExistsException;
import com.hsbc.training.models.ConceptualTraining;
import com.hsbc.training.models.Employee;

public class TrainingDaoImpl implements TrainingDao{

	private TreeMap<String,ConceptualTraining> trainings;
		

	public TrainingDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		this.trainings=new TreeMap(new TrainingSorter());
	}

	@Override
	public boolean addTraining(ConceptualTraining training) {
		// TODO Auto-generated method stub
		
		if(this.trainings.containsKey(training.getCourseName()))
			throw new TrainingAlreadyExistsException("Training exists");
		else
			this.trainings.put(training.getCourseName(), training);
		return true;
	}

	@Override
	public TreeMap<String,ConceptualTraining> getAllTrainings() {
		// TODO Auto-generated method stub
		return this.trainings;
	}
	
	
}
