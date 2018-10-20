package br.unipe.web.java.boot;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class SegurancaFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Passando pelo Filtro com Sucesso!!!");
	
		String nome = request.getParameter("nome");		
		if(nome==null) {
			request.setAttribute("nome", "Levynson Luan");
		}
		String idade = request.getParameter("idade");
		if(idade==null) {
			request.setAttribute("idade", "20");
		}
		String email = request.getParameter("email");		
		if(email==null) {
			request.setAttribute("email", "llevyson@gmail.com");
		}
		String nome1 = request.getParameter("nome1");		
		if(nome1==null) {
			request.setAttribute("nome1", "Pabllo Matheus");
		}
		String idade1 = request.getParameter("idade1");
		if(idade1==null) {
			request.setAttribute("idade1", "21");
		}
		String email1 = request.getParameter("email1");		
		if(email1==null) {
			request.setAttribute("email1", "pabllomatheuspaulo@gmail.com");
		}
		String nome2 = request.getParameter("nome2");		
		if(nome2==null) {
			request.setAttribute("nome2", "Pabllo Matheus");
		}
		String idade2 = request.getParameter("idade2");
		if(idade2==null) {
			request.setAttribute("idade2", "21");
		}
		String email2 = request.getParameter("email2");		
		if(email2==null) {
			request.setAttribute("email2", "pabllomatheuspaulo@gmail.com");
		}
		chain.doFilter(request, response);
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

  

}