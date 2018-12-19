package com.ocr.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ocr.beans.Operateur;


/**
 * Servlet implementation class CalculatriceServlet
 */
@WebServlet("/calculatrice")
public class CalculatriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatriceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double nbre1 = 0;
		double nbre2 = 0;
		try {
			 nbre1 = Double.parseDouble(request.getParameter("operande1"));
		}catch(NumberFormatException e) {
			
		}
		
		try {
			 nbre2 = Double.parseDouble(request.getParameter("operande2"));
		}catch(NumberFormatException e) {
			
		}
		//Operateur operateur = new Operateur(Double.parseDouble(request.getParameter("nbre1")), request.getParameter("operateur"), Double.parseDouble(request.getParameter("nbre2")));
		Operateur operateur = new Operateur(nbre1, request.getParameter("operateur"), nbre2);
		
		String resultat = operateur.toString();
		request.setAttribute("resultat", resultat);
		//doGet(request, response);
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}
}
