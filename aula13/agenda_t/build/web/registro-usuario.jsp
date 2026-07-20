<%-- 
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar</title>
    </head>
    <body>
        
        <h1>Novo cadastro</h1>
        
        <form action="" method="post">
            
            <input type="text" name="usuario" id="usuario" placeholder="Usuário" required >
            <br><br>
            <input type="text" name="telefone" id="telefone" placeholder="N° de telefone"required >
            <br><br>
            
            <div>
            <input type="password" name="senha" id="senha" placeholder="Senha" required >
            <button id="btn-senha" >Mostrar</button>
            </div>
            
            <br>
            
            <div>
            <input type="password" name="senha-conf" id="senha-conf" placeholder="Confirme a senha" required >
            <button id="btn-senha-conf" >Mostrar</button>
            </div>
            
            <br>
             
            <input type="submit" value="Cadastrar">
            <br><br>
            
            <span>JÁ tem uma conta? </span>
            <a href="index.jsp"> Faça o login aqui!</a>
            
        </form>
        
        <script>
            const senha = document.getElementById("senha")
            const senhaConf = document.getElementById("senha-conf")
            const btnSenha = document.getElementById("btn-senha")
            const btnSenhaConf = document.getElementById("btn-senha-conf")
            
            btnSenha.addEventListener("click", ()=>{
                if ( senha.type == "text" ) {
                    senha.type = "password";
                    btnSenha.innerHTML = "Esconder";
                } else {
                    senha.type = "text";
                    btnSenha.innerHTML = "Mostrar";
            } )
        </script>
        
    </body>
</html>
