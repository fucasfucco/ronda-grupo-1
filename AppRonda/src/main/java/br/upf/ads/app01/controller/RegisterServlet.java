package br.upf.ads.app01.controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.upf.ads.app01.jpa.JpaUtil;
import br.upf.ads.app01.model.Usuario;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	
	EntityManager em = JpaUtil.getEntityManager();
    em.getTransaction().begin();
    Usuario User = new Usuario(Long.parseLong(request.getParameter("id")),request.getParameter("email"),request.getParameter("nome"),request.getParameter("senha"));
    
	
	
	
    	try {
    		em.merge(User);
    		em.getTransaction().commit();
    		request.setAttribute("mensagemRegister", "Registrado com sucesso!");
    		request.getRequestDispatcher("Login.jsp").forward(request, response); 
    	}catch(Exception e ) {}
    	em.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
    
    