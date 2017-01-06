package br.local.dns.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contador")
public class ContadorServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 9007481109115572375L;

    private int contador = 0;

    @Override
    public void destroy() {
        super.destroy();
        log("Destruindo a servlet");
    }

    @Override
    public void init(final ServletConfig config) throws ServletException {
        super.init(config);
        log("Inicializando a servlet");
    }

    @Override
    protected void service(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
        contador++;
        final PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Contador = " + contador);
        out.println("</body>");
        out.println("</html>");

    }

}
