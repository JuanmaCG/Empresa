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
 * Servlet implementation class ModificarEmpleado
 */
public class ModificarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarEmpleado() {
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
			Empleado emp = new Empleado(request.getParameter("nombre"), request.getParameter("dni"), request.getParameter("sexo").trim().charAt(0), Integer.parseInt(request.getParameter("categoria")),Integer.parseInt(request.getParameter("anyos")));
			bbdd.editarEmpleado(emp);
			RequestDispatcher rd;
			request.setAttribute("modificado", "true");
			rd = request.getRequestDispatcher("/empleadoModificado.jsp");
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
