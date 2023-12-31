package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title> Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>HeadersHTTP</h1>");
        out.print("<br>");
        out.print("Metodo HTTP: " + metodoHttp);
        String uri = request.getRequestURI();
        out.print("<br>");
        out.print("URI solicitada: "  + uri);
        
        // IMPRIMIR TODOS LOS CABECEROS DISPONIBLES
        out.print("<br>");
        out.print("<br>");
        
        Enumeration cabeceros = request.getHeaderNames();
        while (cabeceros.hasMoreElements()) { 
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<br>" + nombreCabecero + "</br>");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");
        }

        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}