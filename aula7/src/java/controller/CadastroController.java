package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;


@WebServlet(name = "CadastroController", urlPatterns = {"/CadastroController"})
public class CadastroController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        
        //Importando classe para manipular datas
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dataBrasil = new SimpleDateFormat("dd/M/yyyy");
        
        //Recebendo os dados do formulário
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String dataNasc = request.getParameter("data-nasc");
        String senha = request.getParameter("senha");
        String avisos = request.getParameter("avisos");
        
        // Criando objeto de Usuário
        Usuario u = new Usuario();
        
        // Inserindo dados no objeto(setters)
       
       u.setId(111);
       u.setNome("valdemar pires");
       u.setCpf("123.123.123-12");
       u.setTelefone("12-12345.1234");
       u.setEmail("vademar@ig.com");
       u.setDataNasc(dataFormat.parse("2000-11-10"));
       u.setSenha("12345");
       //u.setAvisos(avisos);
       
       //Criando objeto utilizando construtor
       Usuario u1 = new Usuario(email, senha);
       u1.setId(222);
       u1.setNome(nome);
       u1.setDataNasc(dataFormat.parse(dataNasc));
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<h3>" + nome + "</h3>");
            out.println("<h3>" + cpf + "</h3>");
            out.println("<h3>" + telefone + "</h3>");
            out.println("<h3>" + email + "</h3>");
            out.println("<h3>" + dataNasc + "</h3>");
            out.println("<h3>" + senha + "</h3>");
            out.println("<h3>" + avisos + "</h3>");
            
            out.println("<h3>" + u + "</h3>");            
            
            out.println("<h3>EMAIL: " + u.getEmail() + "</h3>");
            out.println("<h3>TELEFONE: " + u.getTelefone() + "</h3>");
            
            out.println("<h3>" + u1 + "</h3>");
            
           out.println("<h3>" + dataBrasil.format( u.getdataNasc() ) + "</h3>");
           out.println("<h3>" + dataBrasil.format( u1.getdataNasc() ) + "</h3>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            System.getLogger(CadastroController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            System.getLogger(CadastroController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
