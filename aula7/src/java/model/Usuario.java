package model;

import java.util.Date;
// Atributos
public class Usuario {
   private int id;
   private String nome;
   private String cpf;
   private String telefone;
   private String email;
   private Date dataNasc;
   private String senha;
   private boolean avisos;  
   
   // Metodo contrutor
   public Usuario(
           int id,
           String nome,
           String cpf,
           String telefone,
           String email,
           Date dataNasc,
           String senha,
           boolean avisos
   ) {
       this.id = id;
       this.nome = nome;
       this.cpf = cpf;
       this.telefone = telefone;
       this.email = email;
       this.dataNasc = dataNasc;
       this.senha = senha;
       this.avisos = avisos;
   }
   
   // Construtor para login

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
   
    // Construtor vazio (default)
    public Usuario() {}
    
    // Getters
   public int getId() {
       return this.id;
   }
   
   public String getNome() {
       return this.nome;
   }
   
   public String getCpf() {
       return this.cpf;
   }
    
   public String getTelefone() {
       return this.telefone;
   }
   
   public String getEmail() {
       return this.email;
   }
   
   public Date getdataNasc() {
       return this.dataNasc;
   }
   
   public String getSenha() {
       return this.senha;
   }
   
   public boolean getAvisos() {
       return this.avisos;
   }
   
   // Setters
   public void setId (int id) {
       this.id = id;
   }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAvisos(boolean avisos) {
        this.avisos = avisos;
    }
    
    // 
    public String toString () {
    return " <hr>Id: " + this.id +
           " <br>Nome: " + this.nome + 
           " <br>CPF: " + this.cpf +
           " <br>Telefone: " + this.telefone +
           " <br>Email: " + this.email + 
           " <br>Nascimento: " + this.dataNasc + 
           " <br>Senha: " + this.senha + 
           " <br>Avisos: " + this.avisos ;
    }
 }

