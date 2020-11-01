package dev.amcosta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editar-empresa")
public class CompanyEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataSource ds = new DataSource();
		Company company = ds.findById(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("formAction", "/gerenciador/editar-empresa");
		request.setAttribute("formMethod", "POST");
		request.setAttribute("company", company);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("company-form.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataSource ds = new DataSource();
		
		Company company = ds.findById(Integer.parseInt(request.getParameter("id")));
		company.setName(request.getParameter("name"));
		ds.update(company);
		
		response.sendRedirect(String.format("/gerenciador/empresa-detalhe?id=%d", company.getId()));
	}

}
