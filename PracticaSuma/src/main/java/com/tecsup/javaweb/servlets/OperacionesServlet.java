package com.tecsup.javaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tecsup.javaweb.beans.OperacionesBeans;
import com.tecsup.javaweb.daos.OperacionesDaos;

/**
 * Servlet implementation class OperacionesServlet
 */
public class OperacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperacionesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OperacionesBeans opbe = new OperacionesBeans();
		OperacionesDaos opdaos = new OperacionesDaos();
		
		String opUno = request.getParameter("operador1");
		String opDos = request.getParameter("operador2");
		int operacion = Integer.parseInt(request.getParameter("operacion"));
		double resultado = 0.0;
		
		opbe.setOperador1(Integer.parseInt(opUno));
		opbe.setOperador2(Integer.parseInt(opDos));
		
		switch(operacion){
		case 1:
			resultado = opdaos.suma(opbe.getOperador1(), opbe.getOperador2());
			break;
		case 2:
			resultado = opdaos.resta(opbe.getOperador1(), opbe.getOperador2());
			break;
		case 3:
			resultado = opdaos.multiplicacion(opbe.getOperador1(), opbe.getOperador2());
			break;
		case 4:
			resultado = opdaos.suma(opbe.getOperador1(), opbe.getOperador2());
			break;
			
		}
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("El resultado es: "+ resultado);
		out.println("</body>");
		out.println("</html>");
		out.close();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
	}

}
