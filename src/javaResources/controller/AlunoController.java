package javaResources.controller;

import javaResources.model.AlunoModel;

public class AlunoController {
	
	public AlunoModel listAlunoByIdController(int id) {
		return new AlunoModel().listAlunoByIdModel(id);
	}
	
}
