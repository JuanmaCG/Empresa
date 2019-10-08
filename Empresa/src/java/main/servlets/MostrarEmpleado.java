package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bbdd.BBDD;
import laboral.DatosNoCorrectosException;
import laboral.Empleado;

/**
 * Servlet implementation class MostrarEmpleado
 */
public class MostrarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		BBDD bbdd;
		
		try {
			bbdd = new BBDD();
			Empleado emp = bbdd.buscarEmpleado(request.getParameter("dni"));
			RequestDispatcher rd;
			request.setAttribute("empleado", emp);
			rd = request.getRequestDispatcher("/modificaEmpleado.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatosNoCorrectosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
