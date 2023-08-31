package com.hsbc.training.bl;

import java.util.Comparator;

import com.hsbc.training.models.ConceptualTraining;

public class TrainingSorter implements Comparator<ConceptualTraining>{

	@Override
	public int compare(ConceptualTraining o1, ConceptualTraining o2) {
		// TODO Auto-generated method stub
		return o1.getCourseName().compareTo(o2.getCourseName());
	}

}
