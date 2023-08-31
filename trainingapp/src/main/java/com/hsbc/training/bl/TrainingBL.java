package com.hsbc.training.bl;

import java.util.TreeMap;

import com.hsbc.training.models.ConceptualTraining;

public interface TrainingBL {
	boolean addTraining(ConceptualTraining training);
	TreeMap<String,ConceptualTraining> getAllTrainings();

}
