package br.unipe.web.java.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "FormularioServlet",
        urlPatterns = {"/formulario"}
    )
public class FormularioServlet extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest req, 
    		HttpServletResponse resp)
            throws ServletException, IOException {
		
	
    	String parametro = req.getParameter("nome");
    	if(parametro == null)
    		parametro = req.getAttribute("nome").toString();
    	String idade = req.getParameter("idade");
    	if(idade == null)
    		idade = req.getAttribute("idade").toString();
    	String email = req.getParameter("email");
    	if(email == null)
    		email = req.getAttribute("email").toString();
    	String parametro1 = req.getParameter("nome1");
    	if(parametro1 == null)
    		parametro1 = req.getAttribute("nome1").toString();
    	String idade1 = req.getParameter("idade1");
    	if(idade1 == null)
    		idade1 = req.getAttribute("idade1").toString();
    	String email1 = req.getParameter("email1");
    	if(email1 == null)
    		email1 = req.getAttribute("email1").toString();
    	String parametro2 = req.getParameter("nome2");
    	if(parametro2 == null)
    		parametro2 = req.getAttribute("nome2").toString();
    	String idade2 = req.getParameter("idade2");
    	if(idade2 == null)
    		idade2 = req.getAttribute("idade2").toString();
    	String email2 = req.getParameter("email2");
    	if(email2 == null)
    		email2 = req.getAttribute("email2").toString();
        ServletOutputStream out = resp.getOutputStream();
        String saida = "<h1>Grupinho do Barulho</h1>";
        String saida1 = "<p>Nome:" + parametro + "</p><p>Idade:" + idade + "</p><p>Email:"+ email+"</p>";
        String saida2 = "<p>Nome:" + parametro1 + "</p><p>Idade:" + idade1 + "</p><p>Email:"+ email1+"</p>";
        String saida3 = "<p>Nome:" + parametro2 + "</p><p>Idade:" + idade2 + "</p><p>Email:"+ email2+"</p>";
       
        out.write(saida.getBytes());
        out.write(saida1.getBytes());
        out.write(saida2.getBytes());
        out.write(saida3.getBytes());

        out.flush();
        out.close();
    }

}
