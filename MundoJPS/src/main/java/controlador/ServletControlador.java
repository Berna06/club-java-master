
package controlador;

import Utilerias.Rectangulo;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 *
 * @author bernardo
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        //1. Procesamos los parametros
        
        //2. Creamos los javabeans
        Rectangulo rect = new Rectangulo(6, 9);
        
        //3. Agregamos el java bean
        request.setAttribute("Mensaje", "Hola saludos desde el Servlet");
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("restangulo", rect);
        
        //4. redireccionamos a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        
    }
}
