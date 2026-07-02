package model;



public class Usuario {
   private int id;
   private String nome;
   private String cpf;
   private String email;
   private String telefone;
   private String cep;
   private String numero;
   private String rua;
   private String senha;
   private boolean avisos;  
   
   public Usuario(
           int id,
           String nome,
           String cpf,
           String telefone,
           String cep,
           String numero,
           String rua,
           String email,
           String senha,
           boolean avisos
   ) {
       this.id = id;
       this.nome = nome;
       this.cpf = cpf;
       this.email = email;
       this.telefone = telefone;
       this.cep = cep;
       this.numero = numero;
       this.rua = rua;
       this.senha = senha;
       this.avisos = avisos;
   }

    public int getId() {
       return this.id;
   }
   
   public String getNome() {
       return this.nome;
   }
   
   public String getCpf() {
       return this.cpf;
   }
    
   public String getEmail() {
       return this.email;
   }
   
   public String getTelefone() {
       return this.telefone;
   }
   
   public String getCep() {
       return this.cep;
   }
   
   public String getNumero() {
       return this.numero;
   }
   
   public String getRua() {
       return this.rua;
   }
   
   public String getSenha() {
       return this.senha;
   }
   
   public boolean getAvisos() {
       return this.avisos;
   }
   
   public void setId (int id) {
       this.id = id;
   }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAvisos(boolean avisos) {
        this.avisos = avisos;
    }
    
    public String toString () {
    return " <hr>Id: " + this.id +
           " <br>Nome: " + this.nome + 
           " <br>CPF: " + this.cpf +
           " <br>Email: " + this.email + 
           " <br>Telefone: " + this.telefone +
           " <br>CEP: " + this.cep +
           " <br>Número: " + this.numero +
           " <br>Rua: " + this.rua +
           " <br>Senha: " + this.senha + 
           " <br>Avisos: " + this.avisos ;
    }
 }

