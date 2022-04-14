package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/CabecerosRespuesta")
public class CabecerosRespuestas extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        
        response.setHeader("Pragma", "no cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        //Desplegamos informacion al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total1\t=SUMA(B2:B3)");
        out.close();
    }
}
