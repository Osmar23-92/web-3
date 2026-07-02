package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastroController", urlPatterns = {"/CadastroServlet"})
public class CadastroController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Configura a codificação dos caracteres
        request.setCharacterEncoding("UTF-8");
        
        // Captura os parâmetros enviados pelo formulário HTML
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String cep = request.getParameter("cep");
        String numero = request.getParameter("numero");
        String rua = request.getParameter("rua");
        String senha = request.getParameter("senha");
        boolean avisos = request.getParameter("avisos") != null;
        
        int id = 0; // Provisório até usar banco de dados
        
        // Criando o objeto correto com todos os parâmetros do Model
        model.Usuario novoUsuario = new model.Usuario(id, nome, cpf, email, telefone, cep, numero, rua, senha, avisos);
        
        // Guarda o aviso na sessão
        request.getSession().setAttribute("mensagemSucesso", "Cadastro realizado com sucesso!");
        
        // Redireciona de volta para a página principal
        response.sendRedirect(request.getContextPath() + "/index.html?sucesso=true");
    } 

    @Override
    public String getServletInfo() {
        return "Controller responsável pelo cadastro de usuários";
    }
}