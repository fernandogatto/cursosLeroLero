package javaResources.controller;

import javaResources.model.AdministradorModel;

public class AdministradorController {

	public AdministradorModel listAdministradorByIdController(int id) {
		return new AdministradorModel().listAdministradorByIdModel(id);
	}
	
}
