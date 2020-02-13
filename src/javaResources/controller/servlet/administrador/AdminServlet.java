package javaResources.controller.servlet.administrador;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;

/**
 * Servlet implementation class CRUDServlet
 */
@WebServlet("/administrador/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) {
		String parametro = request.getParameter("logica");
		String nomeDaClasse = "javaResources.controller.servlet.function." + parametro;
	    
		try {
			Class classe = Class.forName(nomeDaClasse);
			LogicaInterface logica = (LogicaInterface) classe.newInstance();
			
			// Recebe o String após a execução da lógica
			String pagina = logica.executa(request, response);
			
			// Faz o forward para a página JSP
			request.getRequestDispatcher(pagina).forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
