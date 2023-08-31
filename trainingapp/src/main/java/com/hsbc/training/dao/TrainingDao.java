package com.hsbc.training.dao;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.hsbc.training.models.ConceptualTraining;

public interface TrainingDao {

	boolean addTraining(ConceptualTraining training);
	TreeMap<String,ConceptualTraining> getAllTrainings();
}
