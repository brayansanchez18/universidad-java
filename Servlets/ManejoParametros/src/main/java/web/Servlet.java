package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // LEER LOS PARAMETROS DEL FORMULARIO HTML
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("pass");
        
        // LO MANDAMOS A IMPRIMIR A LA CONSOLA DE GLASSFISH
        System.out.println("usuario = " + usuario);
        System.out.println("pass = " + pass);
        
        // LO MANDAMOS A IMPRIMIR EN EL DOCUMENTO HTML
        PrintWriter out = response.getWriter();
        out.println("El valor del usuario es " + usuario);
        out.println("El valor del passwoed es " + pass);
    }
}