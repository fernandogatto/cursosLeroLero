package javaResources.controller.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LogicaInterface {
	String executa(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
