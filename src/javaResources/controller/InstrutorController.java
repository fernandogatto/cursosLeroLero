package javaResources.controller;

import javaResources.model.InstrutorModel;

public class InstrutorController {
	
	public InstrutorModel listInstrutorByIdController(int id) {
		return new InstrutorModel().listInstrutorByIdModel(id);
	}
	
}
