package javaResources.controller;

import javaResources.model.CursoModel;

public class CursoController {

	public CursoModel listCursoByIdController(int id) {
		return new CursoModel().listCursoByIdModel(id);
	}
	
}
