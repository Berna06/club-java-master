package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.*;

@WebServlet("Parametros")
public class Param extends HttpServlet{
    
    @Override 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //leer lo sparametros del formulario html
        String usuario = request.getParameter("Usuario");
        String password = request.getParameter("Password");
        
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        
            PrintWriter out = response.getWriter();
            out.print("<html>");
            out.print("<body>");
            out.print("El parametro usuario es:" + usuario);
            out.print("<br/>");
            out.print("el parametro password es:" + password);
            out.print("</body>");
            out.print("</html>");
            
            
            
    }
}
