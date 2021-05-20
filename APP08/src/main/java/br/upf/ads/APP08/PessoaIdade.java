package br.upf.ads.APP08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PessoaIdade
 */
@WebServlet("/PessoaIdade")
public class PessoaIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PessoaIdade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		out.append("<form>");

		out.append("  Digite seu nome: ");
		out.append("   <br>    ");
		out.append("  Altura: ");
		out.append("   <input type='text' name='height'>  ");
		out.append("  <br>");
		out.append("  Peso: ");
		out.append("   <input type='text' name='weight'> ");
		out.append("   <br>    ");
		out.append("    <button type='submit'>Enviar</button>");

		out.append("</form>");

		// -------------------------------------
		if (request.getParameter("height") != null && request.getParameter("weight") != null) {
			String height = request.getParameter("height");
			String weight = request.getParameter("weight");

			double doubleHeight = Double.parseDouble(height);
			double doubleWeight = Double.parseDouble(weight);
			out.append("   <br>    ");
			out.append("   <br>    ");
			out.append("   <h4>O seu imc:  </h4> " + doubleWeight / (doubleHeight * doubleHeight ));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
