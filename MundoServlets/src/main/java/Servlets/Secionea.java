package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.*;

@WebServlet("/SecionesServlet")
public class Secionea extends HttpServlet{
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException{
        response.setContentType("text/html;charsetUTF-8");
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        //pedri el atributo contador visitas
        Integer contadorVisitas = (Integer) sesion.getAttribute("Contador de las visitas: ");
        //si es nulo es la primera vez que se asignara 
        if(contadorVisitas == null){
           // contadorVisitas = i;
            titulo = "Binevenido usuario nuevo";
        }
        else{
            contadorVisitas++;
            titulo = "Binevenido de nuevo gracias por volver";
        }
        //agragamos el nuevo valor a la sesion
        sesion.setAttribute("contadorViitas", contadorVisitas);
        //se le manda respuesta al cliente
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("no acceso al rescurso" + contadorVisitas);
        out.print("<br>");
        out.print("ID de la secion" + sesion.getId());
        out.close();
    }
  
}
