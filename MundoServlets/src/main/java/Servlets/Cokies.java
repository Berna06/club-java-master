package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;

@WebServlet("ServletServlet")
public class Cokies {

    public class CookiesServlet extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            //el usuario es nuevo
            boolean nuevoUsuario = true;
            //arreglo
            Cookie[] cookies = request.getCookies();

            //Buscamos si ya existe
            //el cual se llamara visitante
            if (cookies != null) {
                for (Cookie c : cookies) {
                    if (c.getName().equals("visitante") && c.getValue().equals("si")) {
                        nuevoUsuario = false;
                        break;
                    }
                }
            }
            String mensaje = null;
            if(nuevoUsuario){
                Cookie visitantenew = new Cookie("visitante", "si");
                response.addCookie(visitantenew);
                mensaje = "nuevo usuario";
            }
            else{
                mensaje = "usuario existente";
            }
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print("Mensaje:" + mensaje);
            out.close();
        }
    }
}
