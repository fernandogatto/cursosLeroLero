package javaResources.controller;

import javaResources.model.AluonModel;

public class AlunoController {
	
	public AlunoModel listAlunoByIdController(int id) {
		return new AlunoModel().listAlunoByIdModel(id);
	}
	
}
