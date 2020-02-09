package javaResources.controller;

import java.util.List;

import javaResources.model.InstrutorModel;

public class InstrutorController {
	
	public InstrutorModel listInstrutorByIdController(int id) {
		return new InstrutorModel().listInstrutorByIdModel(id);
	}
	
	public List<InstrutorModel> listAllInstrutoresController() {
		return new InstrutorModel().listAllInstrutoresModel();
	}
	
}
