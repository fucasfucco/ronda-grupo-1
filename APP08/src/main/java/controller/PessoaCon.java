package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pessoa;

/**
 * Servlet implementation class PessoaCon
 */
@WebServlet("/Pessoa/PessoaCon")
public class PessoaCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PessoaCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// Instanciar uma pessoa com os dados que vieram
			Pessoa p = new Pessoa(
					Integer.parseInt(request.getParameter("id")), 
					request.getParameter("nome"), 
					Integer.parseInt(request.getParameter("idade")));
			// Adicionar o objeto numa coleção
			// Manter a coleção de objetos na sessão do usuário.
			List<Pessoa> lista = (List<Pessoa>) request.getSession().getAttribute("lista");
			if (lista == null) // na primeira requisição ainda não tem a lista na sessão = null
				lista = new ArrayList<Pessoa>();
			lista.add(p);
			request.getSession().setAttribute("lista", lista);
			// Vamos colcoar o objeto pessoa instanciano na requisição para repassar so PessoaList.jsp
			request.setAttribute("pessoa", p);
			// Agora depois de tudo pronto com os objetos / persistência / etc. repassamos a requisição
			// para o PessoaList.jsp renderizar a resposta. 
			request.getRequestDispatcher("PessoaList.jsp").forward(request, response);
		}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
