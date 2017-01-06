package br.local.dns.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.local.dns.jdbc.modelo.Contato;
import br.local.dns.jdbc.modelo.dao.ContatoDao;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 8491632267721482381L;

    @Override
    protected void service(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
        final PrintWriter out = response.getWriter();

        final String nome = request.getParameter("nome");
        final String endereco = request.getParameter("endereco");
        final String email = request.getParameter("email");
        final String dataEmTexto = request.getParameter("dataNascimento");

        Calendar dataNascimento = null;

        Date date;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
            dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(date);
        } catch (final ParseException e) {
            out.println("Erro na conversão da data");
            e.printStackTrace();
            return;
        }

        final Contato contato = new Contato();
        contato.setName(nome);
        contato.setAddress(endereco);
        contato.setEmail(email);
        contato.setBirthDate(dataNascimento);

        final ContatoDao dao = new ContatoDao();
        dao.adiciona(contato);

        out.println("<html>");
        out.println("<body>");
        out.println("Contato " + contato.getName() + " adicionado com sucesso!!");
        out.println("</body>");
        out.println("</html>");

    }
}
