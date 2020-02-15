package javaResources.controller.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogicaServlet
 */
@WebServlet("/LogicaServlet")
public class LogicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogicaServlet() {
        super();
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
