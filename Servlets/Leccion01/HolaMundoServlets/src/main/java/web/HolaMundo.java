package web;

//  para crear un servlet la clase debe de extender del paquete http servlets
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// notacion para poder reconocerlo desde el navegador y poder accederlo
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet { 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola mundo desde java servlets");
    }
}