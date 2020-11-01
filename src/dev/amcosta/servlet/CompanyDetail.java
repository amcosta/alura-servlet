package dev.amcosta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empresa-detalhe")
public class CompanyDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		DataSource ds = new DataSource();
		Company company = ds.findById(Integer.parseInt(id));
		
		request.setAttribute("company", company);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("empresa-detalhe.jsp");
		requestDispatcher.forward(request, response);

		System.out.println(company);
	}

}
